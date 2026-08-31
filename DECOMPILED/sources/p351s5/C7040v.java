package p351s5;

import com.google.protobuf.AbstractC5063B;
import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;
import java.util.List;

/* JADX INFO: renamed from: s5.v */
/* JADX INFO: loaded from: classes.dex */
public final class C7040v extends AbstractC5136y implements InterfaceC5083V {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final C7040v DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile InterfaceC5097e0 PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private int bitField0_;
    private C7035q currentDocument_;
    private Object operation_;
    private C7027i updateMask_;
    private int operationCase_ = 0;
    private AbstractC5063B.e updateTransforms_ = AbstractC5136y.m23683A();

    /* JADX INFO: renamed from: s5.v$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f28169a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f28169a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28169a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28169a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28169a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28169a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28169a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28169a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: s5.v$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: A */
        public b m31090A(C7024f c7024f) {
            m23724r();
            ((C7040v) this.f19622b).m31077z0(c7024f);
            return this;
        }

        /* JADX INFO: renamed from: B */
        public b m31091B(C7027i c7027i) {
            m23724r();
            ((C7040v) this.f19622b).m31061A0(c7027i);
            return this;
        }

        /* JADX INFO: renamed from: C */
        public b m31092C(String str) {
            m23724r();
            ((C7040v) this.f19622b).m31062B0(str);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public b m31093x(C7029k.c cVar) {
            m23724r();
            ((C7040v) this.f19622b).m31070g0(cVar);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m31094y(C7035q c7035q) {
            m23724r();
            ((C7040v) this.f19622b).m31075x0(c7035q);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public b m31095z(String str) {
            m23724r();
            ((C7040v) this.f19622b).m31076y0(str);
            return this;
        }

        private b() {
            super(C7040v.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: s5.v$c */
    public enum c {
        UPDATE(1),
        DELETE(2),
        VERIFY(5),
        TRANSFORM(6),
        OPERATION_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        private final int f28176a;

        c(int i7) {
            this.f28176a = i7;
        }

        /* JADX INFO: renamed from: d */
        public static c m31097d(int i7) {
            if (i7 == 0) {
                return OPERATION_NOT_SET;
            }
            if (i7 == 1) {
                return UPDATE;
            }
            if (i7 == 2) {
                return DELETE;
            }
            if (i7 == 5) {
                return VERIFY;
            }
            if (i7 != 6) {
                return null;
            }
            return TRANSFORM;
        }
    }

    static {
        C7040v c7040v = new C7040v();
        DEFAULT_INSTANCE = c7040v;
        AbstractC5136y.m23695V(C7040v.class, c7040v);
    }

    private C7040v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public void m31061A0(C7027i c7027i) {
        c7027i.getClass();
        this.updateMask_ = c7027i;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public void m31062B0(String str) {
        str.getClass();
        this.operationCase_ = 5;
        this.operation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public void m31070g0(C7029k.c cVar) {
        cVar.getClass();
        m31071h0();
        this.updateTransforms_.add(cVar);
    }

    /* JADX INFO: renamed from: h0 */
    private void m31071h0() {
        AbstractC5063B.e eVar = this.updateTransforms_;
        if (eVar.mo22849h()) {
            return;
        }
        this.updateTransforms_ = AbstractC5136y.m23687L(eVar);
    }

    /* JADX INFO: renamed from: u0 */
    public static b m31072u0() {
        return (b) DEFAULT_INSTANCE.m23715u();
    }

    /* JADX INFO: renamed from: v0 */
    public static b m31073v0(C7040v c7040v) {
        return (b) DEFAULT_INSTANCE.m23716v(c7040v);
    }

    /* JADX INFO: renamed from: w0 */
    public static C7040v m31074w0(byte[] bArr) {
        return (C7040v) AbstractC5136y.m23691R(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public void m31075x0(C7035q c7035q) {
        c7035q.getClass();
        this.currentDocument_ = c7035q;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public void m31076y0(String str) {
        str.getClass();
        this.operationCase_ = 2;
        this.operation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public void m31077z0(C7024f c7024f) {
        c7024f.getClass();
        this.operation_ = c7024f;
        this.operationCase_ = 1;
    }

    /* JADX INFO: renamed from: i0 */
    public C7035q m31078i0() {
        C7035q c7035q = this.currentDocument_;
        return c7035q == null ? C7035q.m30821d0() : c7035q;
    }

    /* JADX INFO: renamed from: j0 */
    public String m31079j0() {
        return this.operationCase_ == 2 ? (String) this.operation_ : "";
    }

    /* JADX INFO: renamed from: k0 */
    public c m31080k0() {
        return c.m31097d(this.operationCase_);
    }

    /* JADX INFO: renamed from: l0 */
    public C7029k m31081l0() {
        return this.operationCase_ == 6 ? (C7029k) this.operation_ : C7029k.m30738a0();
    }

    /* JADX INFO: renamed from: m0 */
    public C7024f m31082m0() {
        return this.operationCase_ == 1 ? (C7024f) this.operation_ : C7024f.m30701d0();
    }

    /* JADX INFO: renamed from: n0 */
    public C7027i m31083n0() {
        C7027i c7027i = this.updateMask_;
        return c7027i == null ? C7027i.m30728d0() : c7027i;
    }

    /* JADX INFO: renamed from: o0 */
    public List m31084o0() {
        return this.updateTransforms_;
    }

    /* JADX INFO: renamed from: p0 */
    public String m31085p0() {
        return this.operationCase_ == 5 ? (String) this.operation_ : "";
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m31086q0() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: r0 */
    public boolean m31087r0() {
        return this.operationCase_ == 6;
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m31088s0() {
        return this.operationCase_ == 1;
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m31089t0() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f28169a[dVar.ordinal()]) {
            case 1:
                return new C7040v();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", "bitField0_", C7024f.class, "updateMask_", "currentDocument_", C7029k.class, "updateTransforms_", C7029k.c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C7040v.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC5136y.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
