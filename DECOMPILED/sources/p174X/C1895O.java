package p174X;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p173W5.InterfaceC1879i;
import p238e6.InterfaceC5371p;

/* JADX INFO: renamed from: X.O */
/* JADX INFO: loaded from: classes.dex */
public final class C1895O implements InterfaceC1879i.b {

    /* JADX INFO: renamed from: c */
    public static final a f6098c = new a(null);

    /* JADX INFO: renamed from: d */
    private static final String f6099d = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* JADX INFO: renamed from: a */
    private final C1895O f6100a;

    /* JADX INFO: renamed from: b */
    private final C1907k f6101b;

    /* JADX INFO: renamed from: X.O$a */
    public static final class a {

        /* JADX INFO: renamed from: X.O$a$a, reason: collision with other inner class name */
        public static final class C7652a implements InterfaceC1879i.c {

            /* JADX INFO: renamed from: a */
            public static final C7652a f6102a = new C7652a();

            private C7652a() {
            }
        }

        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    public C1895O(C1895O c1895o, C1907k instance) {
        AbstractC6118n.m27187e(instance, "instance");
        this.f6100a = c1895o;
        this.f6101b = instance;
    }

    /* JADX INFO: renamed from: a */
    public final void m7831a(InterfaceC1905i candidate) {
        AbstractC6118n.m27187e(candidate, "candidate");
        if (this.f6101b == candidate) {
            throw new IllegalStateException(f6099d.toString());
        }
        C1895O c1895o = this.f6100a;
        if (c1895o != null) {
            c1895o.m7831a(candidate);
        }
    }

    @Override // p173W5.InterfaceC1879i.b, p173W5.InterfaceC1879i
    public Object fold(Object obj, InterfaceC5371p interfaceC5371p) {
        return InterfaceC1879i.b.a.m7782a(this, obj, interfaceC5371p);
    }

    @Override // p173W5.InterfaceC1879i.b, p173W5.InterfaceC1879i
    public InterfaceC1879i.b get(InterfaceC1879i.c cVar) {
        return InterfaceC1879i.b.a.m7783b(this, cVar);
    }

    @Override // p173W5.InterfaceC1879i.b
    public InterfaceC1879i.c getKey() {
        return a.C7652a.f6102a;
    }

    @Override // p173W5.InterfaceC1879i.b, p173W5.InterfaceC1879i
    public InterfaceC1879i minusKey(InterfaceC1879i.c cVar) {
        return InterfaceC1879i.b.a.m7784c(this, cVar);
    }

    @Override // p173W5.InterfaceC1879i
    public InterfaceC1879i plus(InterfaceC1879i interfaceC1879i) {
        return InterfaceC1879i.b.a.m7785d(this, interfaceC1879i);
    }
}
