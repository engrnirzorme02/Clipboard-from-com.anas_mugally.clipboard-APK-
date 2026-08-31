package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.Route;

/* JADX INFO: loaded from: classes.dex */
public final class RouteDatabase {

    /* JADX INFO: renamed from: a */
    private final Set f25704a = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public final synchronized void m29026a(Route route) {
        AbstractC6118n.m27187e(route, "route");
        this.f25704a.remove(route);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m29027b(Route failedRoute) {
        AbstractC6118n.m27187e(failedRoute, "failedRoute");
        this.f25704a.add(failedRoute);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m29028c(Route route) {
        AbstractC6118n.m27187e(route, "route");
        return this.f25704a.contains(route);
    }
}
