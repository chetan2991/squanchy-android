package net.squanchy.search;

import net.squanchy.injection.ApplicationInjector;
import net.squanchy.navigation.NavigationModule;

final class SearchInjector {

    private SearchInjector() {
        // no instances
    }

    public static SearchComponent obtain(SearchActivity activity) {
        return DaggerSearchComponent.builder()
                .applicationComponent(ApplicationInjector.obtain(activity))
                .searchModule(new SearchModule())
                .navigationModule(new NavigationModule(activity))
                .build();
    }
}
