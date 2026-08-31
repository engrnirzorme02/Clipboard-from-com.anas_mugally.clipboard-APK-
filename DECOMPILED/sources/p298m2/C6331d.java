package p298m2;

import p234e2.AbstractC5338d;
import p234e2.InterfaceC5336b;

/* JADX INFO: renamed from: m2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6331d implements InterfaceC5336b {

    /* JADX INFO: renamed from: m2.d$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private static final C6331d f24165a = new C6331d();
    }

    /* JADX INFO: renamed from: a */
    public static C6331d m27290a() {
        return a.f24165a;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC6328a m27291c() {
        return (InterfaceC6328a) AbstractC5338d.m24331d(AbstractC6329b.m27285b());
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC6328a get() {
        return m27291c();
    }
}
