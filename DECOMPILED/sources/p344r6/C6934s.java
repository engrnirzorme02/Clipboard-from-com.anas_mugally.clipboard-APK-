package p344r6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p336q6.EnumC6845a;
import p352s6.AbstractC7045b;
import p352s6.AbstractC7047d;
import p352s6.AbstractC7056m;
import p352s6.InterfaceC7054k;
import p360t6.C7104D;

/* JADX INFO: renamed from: r6.s */
/* JADX INFO: loaded from: classes.dex */
final class C6934s extends AbstractC7045b implements InterfaceC6929n, InterfaceC6918c, InterfaceC7054k {

    /* JADX INFO: renamed from: e */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27863e = AtomicReferenceFieldUpdater.newUpdater(C6934s.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d */
    private int f27864d;

    /* JADX INFO: renamed from: r6.s$a */
    static final class a extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f27865a;

        /* JADX INFO: renamed from: b */
        Object f27866b;

        /* JADX INFO: renamed from: c */
        Object f27867c;

        /* JADX INFO: renamed from: d */
        Object f27868d;

        /* JADX INFO: renamed from: e */
        Object f27869e;

        /* JADX INFO: renamed from: f */
        /* synthetic */ Object f27870f;

        /* JADX INFO: renamed from: s */
        int f27872s;

        a(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f27870f = obj;
            this.f27872s |= Integer.MIN_VALUE;
            return C6934s.this.mo7891a(null, this);
        }
    }

    public C6934s(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX INFO: renamed from: m */
    private final boolean m30396m(Object obj, Object obj2) {
        int i7;
        AbstractC7047d[] abstractC7047dArrM31123i;
        synchronized (this) {
            Object obj3 = f27863e.get(this);
            if (obj != null && !AbstractC6118n.m27183a(obj3, obj)) {
                return false;
            }
            if (AbstractC6118n.m27183a(obj3, obj2)) {
                return true;
            }
            f27863e.set(this, obj2);
            int i8 = this.f27864d;
            if ((i8 & 1) != 0) {
                this.f27864d = i8 + 2;
                return true;
            }
            int i9 = i8 + 1;
            this.f27864d = i9;
            AbstractC7047d[] abstractC7047dArrM31123i2 = m31123i();
            C1444v c1444v = C1444v.f4971a;
            while (true) {
                C6936u[] c6936uArr = (C6936u[]) abstractC7047dArrM31123i2;
                if (c6936uArr != null) {
                    for (C6936u c6936u : c6936uArr) {
                        if (c6936u != null) {
                            c6936u.m30412g();
                        }
                    }
                }
                synchronized (this) {
                    i7 = this.f27864d;
                    if (i7 == i9) {
                        this.f27864d = i9 + 1;
                        return true;
                    }
                    abstractC7047dArrM31123i = m31123i();
                    C1444v c1444v2 = C1444v.f4971a;
                }
                abstractC7047dArrM31123i2 = abstractC7047dArrM31123i;
                i9 = i7;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008f A[Catch: all -> 0x0042, PHI: r2 r6 r7 r8 r11
      0x008f: PHI (r2v4 o6.y0) = (r2v2 o6.y0), (r2v3 o6.y0), (r2v3 o6.y0), (r2v9 o6.y0) binds: [B:28:0x0080, B:44:0x00c3, B:46:0x00d5, B:15:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x008f: PHI (r6v4 r6.u) = (r6v2 r6.u), (r6v3 r6.u), (r6v3 r6.u), (r6v10 r6.u) binds: [B:28:0x0080, B:44:0x00c3, B:46:0x00d5, B:15:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x008f: PHI (r7v2 r6.d) = (r7v0 r6.d), (r7v1 r6.d), (r7v1 r6.d), (r7v6 r6.d) binds: [B:28:0x0080, B:44:0x00c3, B:46:0x00d5, B:15:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x008f: PHI (r8v4 r6.s) = (r8v2 r6.s), (r8v3 r6.s), (r8v3 r6.s), (r8v10 r6.s) binds: [B:28:0x0080, B:44:0x00c3, B:46:0x00d5, B:15:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x008f: PHI (r11v5 java.lang.Object) = (r11v3 java.lang.Object), (r11v4 java.lang.Object), (r11v4 java.lang.Object), (r11v18 java.lang.Object) binds: [B:28:0x0080, B:44:0x00c3, B:46:0x00d5, B:15:0x003e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0099, B:33:0x009e, B:43:0x00bf, B:45:0x00c5, B:35:0x00a4, B:39:0x00ab, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0099 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0099, B:33:0x009e, B:43:0x00bf, B:45:0x00c5, B:35:0x00a4, B:39:0x00ab, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x009e A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0099, B:33:0x009e, B:43:0x00bf, B:45:0x00c5, B:35:0x00a4, B:39:0x00ab, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0099, B:33:0x009e, B:43:0x00bf, B:45:0x00c5, B:35:0x00a4, B:39:0x00ab, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c3 -> B:29:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d5 -> B:29:0x008f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p344r6.InterfaceC6918c
    /* JADX INFO: renamed from: a */
    public java.lang.Object mo7891a(p344r6.InterfaceC6919d r11, p173W5.InterfaceC1875e r12) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p344r6.C6934s.mo7891a(r6.d, W5.e):java.lang.Object");
    }

    @Override // p344r6.InterfaceC6929n
    /* JADX INFO: renamed from: b */
    public boolean mo30393b(Object obj, Object obj2) {
        if (obj == null) {
            obj = AbstractC7056m.f28204a;
        }
        if (obj2 == null) {
            obj2 = AbstractC7056m.f28204a;
        }
        return m30396m(obj, obj2);
    }

    @Override // p352s6.InterfaceC7054k
    /* JADX INFO: renamed from: c */
    public InterfaceC6918c mo30397c(InterfaceC1879i interfaceC1879i, int i7, EnumC6845a enumC6845a) {
        return AbstractC6935t.m30405d(this, interfaceC1879i, i7, enumC6845a);
    }

    @Override // p344r6.InterfaceC6919d
    /* JADX INFO: renamed from: d */
    public Object mo7892d(Object obj, InterfaceC1875e interfaceC1875e) {
        setValue(obj);
        return C1444v.f4971a;
    }

    @Override // p344r6.InterfaceC6929n
    public Object getValue() {
        C7104D c7104d = AbstractC7056m.f28204a;
        Object obj = f27863e.get(this);
        if (obj == c7104d) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p352s6.AbstractC7045b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C6936u mo30398f() {
        return new C6936u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p352s6.AbstractC7045b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C6936u[] mo30399g(int i7) {
        return new C6936u[i7];
    }

    @Override // p344r6.InterfaceC6929n
    public void setValue(Object obj) {
        if (obj == null) {
            obj = AbstractC7056m.f28204a;
        }
        m30396m(null, obj);
    }
}
