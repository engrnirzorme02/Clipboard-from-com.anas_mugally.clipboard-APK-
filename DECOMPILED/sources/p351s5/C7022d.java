package p351s5;

import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;

/* JADX INFO: renamed from: s5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7022d extends AbstractC5136y implements InterfaceC5083V {
    public static final int BITS_FIELD_NUMBER = 1;
    private static final C7022d DEFAULT_INSTANCE;
    public static final int HASH_COUNT_FIELD_NUMBER = 2;
    private static volatile InterfaceC5097e0 PARSER;
    private int bitField0_;
    private C7021c bits_;
    private int hashCount_;

    /* JADX INFO: renamed from: s5.d$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f28052a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f28052a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28052a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28052a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28052a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28052a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28052a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28052a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: s5.d$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(C7022d.DEFAULT_INSTANCE);
        }
    }

    static {
        C7022d c7022d = new C7022d();
        DEFAULT_INSTANCE = c7022d;
        AbstractC5136y.m23695V(C7022d.class, c7022d);
    }

    private C7022d() {
    }

    /* JADX INFO: renamed from: b0 */
    public static C7022d m30681b0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: a0 */
    public C7021c m30682a0() {
        C7021c c7021c = this.bits_;
        return c7021c == null ? C7021c.m30677b0() : c7021c;
    }

    /* JADX INFO: renamed from: c0 */
    public int m30683c0() {
        return this.hashCount_;
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m30684d0() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f28052a[dVar.ordinal()]) {
            case 1:
                return new C7022d();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "bits_", "hashCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C7022d.class) {
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
