package p351s5;

import com.google.protobuf.AbstractC5062A0;
import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.C5075M;
import com.google.protobuf.C5076N;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: s5.p */
/* JADX INFO: loaded from: classes.dex */
public final class C7034p extends AbstractC5136y implements InterfaceC5083V {
    private static final C7034p DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile InterfaceC5097e0 PARSER;
    private C5076N fields_ = C5076N.m22945d();

    /* JADX INFO: renamed from: s5.p$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f28090a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f28090a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28090a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28090a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28090a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28090a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28090a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28090a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: s5.p$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: A */
        public b m30814A(String str) {
            str.getClass();
            m23724r();
            ((C7034p) this.f19622b).m30806g0().remove(str);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public boolean m30815x(String str) {
            str.getClass();
            return ((C7034p) this.f19622b).m30811d0().containsKey(str);
        }

        /* JADX INFO: renamed from: y */
        public b m30816y(Map map) {
            m23724r();
            ((C7034p) this.f19622b).m30806g0().putAll(map);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public b m30817z(String str, C7039u c7039u) {
            str.getClass();
            c7039u.getClass();
            m23724r();
            ((C7034p) this.f19622b).m30806g0().put(str, c7039u);
            return this;
        }

        private b() {
            super(C7034p.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: s5.p$c */
    private static final class c {

        /* JADX INFO: renamed from: a */
        static final C5075M f28091a = C5075M.m22938d(AbstractC5062A0.b.f19275v, "", AbstractC5062A0.b.f19277x, C7039u.m31031o0());
    }

    static {
        C7034p c7034p = new C7034p();
        DEFAULT_INSTANCE = c7034p;
        AbstractC5136y.m23695V(C7034p.class, c7034p);
    }

    private C7034p() {
    }

    /* JADX INFO: renamed from: b0 */
    public static C7034p m30805b0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public Map m30806g0() {
        return m30808i0();
    }

    /* JADX INFO: renamed from: h0 */
    private C5076N m30807h0() {
        return this.fields_;
    }

    /* JADX INFO: renamed from: i0 */
    private C5076N m30808i0() {
        if (!this.fields_.m22949h()) {
            this.fields_ = this.fields_.m22952l();
        }
        return this.fields_;
    }

    /* JADX INFO: renamed from: j0 */
    public static b m30809j0() {
        return (b) DEFAULT_INSTANCE.m23715u();
    }

    /* JADX INFO: renamed from: c0 */
    public int m30810c0() {
        return m30807h0().size();
    }

    /* JADX INFO: renamed from: d0 */
    public Map m30811d0() {
        return Collections.unmodifiableMap(m30807h0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    public C7039u m30812e0(String str, C7039u c7039u) {
        str.getClass();
        C5076N c5076nM30807h0 = m30807h0();
        return c5076nM30807h0.containsKey(str) ? (C7039u) c5076nM30807h0.get(str) : c7039u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public C7039u m30813f0(String str) {
        str.getClass();
        C5076N c5076nM30807h0 = m30807h0();
        if (c5076nM30807h0.containsKey(str)) {
            return (C7039u) c5076nM30807h0.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f28090a[dVar.ordinal()]) {
            case 1:
                return new C7034p();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", c.f28091a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C7034p.class) {
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
