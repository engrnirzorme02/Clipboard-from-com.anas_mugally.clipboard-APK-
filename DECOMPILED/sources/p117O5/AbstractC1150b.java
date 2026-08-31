package p117O5;

import java.util.concurrent.Executor;
import p063H5.AbstractC0533b;
import p063H5.AbstractC0537d;
import p063H5.C0535c;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: O5.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1150b {

    /* JADX INFO: renamed from: a */
    private final AbstractC0537d f4072a;

    /* JADX INFO: renamed from: b */
    private final C0535c f4073b;

    /* JADX INFO: renamed from: O5.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        AbstractC1150b mo4978a(AbstractC0537d abstractC0537d, C0535c c0535c);
    }

    protected AbstractC1150b(AbstractC0537d abstractC0537d, C0535c c0535c) {
        this.f4072a = (AbstractC0537d) AbstractC1209m.m5303o(abstractC0537d, "channel");
        this.f4073b = (C0535c) AbstractC1209m.m5303o(c0535c, "callOptions");
    }

    /* JADX INFO: renamed from: a */
    protected abstract AbstractC1150b mo4974a(AbstractC0537d abstractC0537d, C0535c c0535c);

    /* JADX INFO: renamed from: b */
    public final C0535c m4975b() {
        return this.f4073b;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC1150b m4976c(AbstractC0533b abstractC0533b) {
        return mo4974a(this.f4072a, this.f4073b.m2353l(abstractC0533b));
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC1150b m4977d(Executor executor) {
        return mo4974a(this.f4072a, this.f4073b.m2355n(executor));
    }
}
