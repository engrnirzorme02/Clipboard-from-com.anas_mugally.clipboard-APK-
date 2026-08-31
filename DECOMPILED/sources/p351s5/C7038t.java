package p351s5;

import com.google.protobuf.AbstractC5063B;
import com.google.protobuf.AbstractC5104i;
import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.C5125s0;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;
import java.util.List;
import p399y5.C7553a;

/* JADX INFO: renamed from: s5.t */
/* JADX INFO: loaded from: classes.dex */
public final class C7038t extends AbstractC5136y implements InterfaceC5083V {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final C7038t DEFAULT_INSTANCE;
    private static volatile InterfaceC5097e0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private C7553a cause_;
    private C5125s0 readTime_;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private AbstractC5063B.d targetIds_ = AbstractC5136y.m23698z();
    private AbstractC5104i resumeToken_ = AbstractC5104i.f19401b;

    /* JADX INFO: renamed from: s5.t$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f28144a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f28144a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28144a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28144a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28144a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28144a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28144a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28144a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: s5.t$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(C7038t.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: s5.t$c */
    public enum c implements AbstractC5063B.a {
        NO_CHANGE(0),
        ADD(1),
        REMOVE(2),
        CURRENT(3),
        RESET(4),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: s */
        private static final AbstractC5063B.b f28151s = new a();

        /* JADX INFO: renamed from: a */
        private final int f28153a;

        /* JADX INFO: renamed from: s5.t$c$a */
        class a implements AbstractC5063B.b {
            a() {
            }
        }

        c(int i7) {
            this.f28153a = i7;
        }

        /* JADX INFO: renamed from: d */
        public static c m31008d(int i7) {
            if (i7 == 0) {
                return NO_CHANGE;
            }
            if (i7 == 1) {
                return ADD;
            }
            if (i7 == 2) {
                return REMOVE;
            }
            if (i7 == 3) {
                return CURRENT;
            }
            if (i7 != 4) {
                return null;
            }
            return RESET;
        }

        @Override // com.google.protobuf.AbstractC5063B.a
        /* JADX INFO: renamed from: a */
        public final int mo22846a() {
            if (this != UNRECOGNIZED) {
                return this.f28153a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        C7038t c7038t = new C7038t();
        DEFAULT_INSTANCE = c7038t;
        AbstractC5136y.m23695V(C7038t.class, c7038t);
    }

    private C7038t() {
    }

    /* JADX INFO: renamed from: b0 */
    public static C7038t m31000b0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: a0 */
    public C7553a m31001a0() {
        C7553a c7553a = this.cause_;
        return c7553a == null ? C7553a.m33250b0() : c7553a;
    }

    /* JADX INFO: renamed from: c0 */
    public C5125s0 m31002c0() {
        C5125s0 c5125s0 = this.readTime_;
        return c5125s0 == null ? C5125s0.m23581c0() : c5125s0;
    }

    /* JADX INFO: renamed from: d0 */
    public AbstractC5104i m31003d0() {
        return this.resumeToken_;
    }

    /* JADX INFO: renamed from: e0 */
    public c m31004e0() {
        c cVarM31008d = c.m31008d(this.targetChangeType_);
        return cVarM31008d == null ? c.UNRECOGNIZED : cVarM31008d;
    }

    /* JADX INFO: renamed from: f0 */
    public int m31005f0() {
        return this.targetIds_.size();
    }

    /* JADX INFO: renamed from: g0 */
    public List m31006g0() {
        return this.targetIds_;
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f28144a[dVar.ordinal()]) {
            case 1:
                return new C7038t();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003ဉ\u0000\u0004\n\u0006ဉ\u0001", new Object[]{"bitField0_", "targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C7038t.class) {
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
