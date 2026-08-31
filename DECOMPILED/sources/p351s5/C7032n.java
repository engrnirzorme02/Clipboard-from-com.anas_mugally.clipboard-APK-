package p351s5;

import com.google.protobuf.AbstractC5062A0;
import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.C5075M;
import com.google.protobuf.C5076N;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;
import java.util.Map;

/* JADX INFO: renamed from: s5.n */
/* JADX INFO: loaded from: classes.dex */
public final class C7032n extends AbstractC5136y implements InterfaceC5083V {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C7032n DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile InterfaceC5097e0 PARSER = null;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private Object targetChange_;
    private int targetChangeCase_ = 0;
    private C5076N labels_ = C5076N.m22945d();
    private String database_ = "";

    /* JADX INFO: renamed from: s5.n$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f28079a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f28079a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28079a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28079a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28079a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28079a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28079a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28079a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: s5.n$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: A */
        public b m30789A(int i7) {
            m23724r();
            ((C7032n) this.f19622b).m30788k0(i7);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public b m30790x(Map map) {
            m23724r();
            ((C7032n) this.f19622b).m30783f0().putAll(map);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m30791y(C7037s c7037s) {
            m23724r();
            ((C7032n) this.f19622b).m30786i0(c7037s);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public b m30792z(String str) {
            m23724r();
            ((C7032n) this.f19622b).m30787j0(str);
            return this;
        }

        private b() {
            super(C7032n.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: s5.n$c */
    private static final class c {

        /* JADX INFO: renamed from: a */
        static final C5075M f28080a;

        static {
            AbstractC5062A0.b bVar = AbstractC5062A0.b.f19275v;
            f28080a = C5075M.m22938d(bVar, "", bVar, "");
        }
    }

    static {
        C7032n c7032n = new C7032n();
        DEFAULT_INSTANCE = c7032n;
        AbstractC5136y.m23695V(C7032n.class, c7032n);
    }

    private C7032n() {
    }

    /* JADX INFO: renamed from: e0 */
    public static C7032n m30782e0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public Map m30783f0() {
        return m30784g0();
    }

    /* JADX INFO: renamed from: g0 */
    private C5076N m30784g0() {
        if (!this.labels_.m22949h()) {
            this.labels_ = this.labels_.m22952l();
        }
        return this.labels_;
    }

    /* JADX INFO: renamed from: h0 */
    public static b m30785h0() {
        return (b) DEFAULT_INSTANCE.m23715u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public void m30786i0(C7037s c7037s) {
        c7037s.getClass();
        this.targetChange_ = c7037s;
        this.targetChangeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public void m30787j0(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public void m30788k0(int i7) {
        this.targetChangeCase_ = 3;
        this.targetChange_ = Integer.valueOf(i7);
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f28079a[dVar.ordinal()]) {
            case 1:
                return new C7032n();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002<\u0000\u00037\u0000\u00042", new Object[]{"targetChange_", "targetChangeCase_", "database_", C7037s.class, "labels_", c.f28080a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C7032n.class) {
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
