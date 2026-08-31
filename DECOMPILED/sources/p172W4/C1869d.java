package p172W4;

import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.C5125s0;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;

/* JADX INFO: renamed from: W4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1869d extends AbstractC5136y implements InterfaceC5083V {
    private static final C1869d DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC5097e0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private C5125s0 version_;

    /* JADX INFO: renamed from: W4.d$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f6035a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f6035a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6035a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6035a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6035a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6035a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6035a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6035a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: W4.d$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: x */
        public b m7741x(String str) {
            m23724r();
            ((C1869d) this.f19622b).m7737g0(str);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m7742y(C5125s0 c5125s0) {
            m23724r();
            ((C1869d) this.f19622b).m7738h0(c5125s0);
            return this;
        }

        private b() {
            super(C1869d.DEFAULT_INSTANCE);
        }
    }

    static {
        C1869d c1869d = new C1869d();
        DEFAULT_INSTANCE = c1869d;
        AbstractC5136y.m23695V(C1869d.class, c1869d);
    }

    private C1869d() {
    }

    /* JADX INFO: renamed from: c0 */
    public static C1869d m7735c0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: f0 */
    public static b m7736f0() {
        return (b) DEFAULT_INSTANCE.m23715u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public void m7737g0(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public void m7738h0(C5125s0 c5125s0) {
        c5125s0.getClass();
        this.version_ = c5125s0;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: d0 */
    public String m7739d0() {
        return this.name_;
    }

    /* JADX INFO: renamed from: e0 */
    public C5125s0 m7740e0() {
        C5125s0 c5125s0 = this.version_;
        return c5125s0 == null ? C5125s0.m23581c0() : c5125s0;
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f6035a[dVar.ordinal()]) {
            case 1:
                return new C1869d();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C1869d.class) {
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
