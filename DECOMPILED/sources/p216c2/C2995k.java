package p216c2;

import java.util.concurrent.Executor;
import p234e2.AbstractC5338d;
import p234e2.InterfaceC5336b;

/* JADX INFO: renamed from: c2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2995k implements InterfaceC5336b {

    /* JADX INFO: renamed from: c2.k$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private static final C2995k f12409a = new C2995k();
    }

    /* JADX INFO: renamed from: a */
    public static C2995k m14956a() {
        return a.f12409a;
    }

    /* JADX INFO: renamed from: b */
    public static Executor m14957b() {
        return (Executor) AbstractC5338d.m24331d(AbstractC2994j.m14955a());
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return m14957b();
    }
}
