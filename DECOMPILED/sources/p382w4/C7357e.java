package p382w4;

import p006A4.C0023h;
import p398y4.AbstractC7551l;

/* JADX INFO: renamed from: w4.e */
/* JADX INFO: loaded from: classes.dex */
public class C7357e {

    /* JADX INFO: renamed from: d */
    public static final C7357e f29313d = new C7357e(a.User, null, false);

    /* JADX INFO: renamed from: e */
    public static final C7357e f29314e = new C7357e(a.Server, null, false);

    /* JADX INFO: renamed from: a */
    private final a f29315a;

    /* JADX INFO: renamed from: b */
    private final C0023h f29316b;

    /* JADX INFO: renamed from: c */
    private final boolean f29317c;

    /* JADX INFO: renamed from: w4.e$a */
    private enum a {
        User,
        Server
    }

    public C7357e(a aVar, C0023h c0023h, boolean z7) {
        this.f29315a = aVar;
        this.f29316b = c0023h;
        this.f29317c = z7;
        AbstractC7551l.m33233f(!z7 || m32389c());
    }

    /* JADX INFO: renamed from: a */
    public static C7357e m32387a(C0023h c0023h) {
        return new C7357e(a.Server, c0023h, true);
    }

    /* JADX INFO: renamed from: b */
    public C0023h m32388b() {
        return this.f29316b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m32389c() {
        return this.f29315a == a.Server;
    }

    /* JADX INFO: renamed from: d */
    public boolean m32390d() {
        return this.f29315a == a.User;
    }

    /* JADX INFO: renamed from: e */
    public boolean m32391e() {
        return this.f29317c;
    }

    public String toString() {
        return "OperationSource{source=" + this.f29315a + ", queryParams=" + this.f29316b + ", tagged=" + this.f29317c + '}';
    }
}
