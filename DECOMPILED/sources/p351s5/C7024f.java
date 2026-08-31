package p351s5;

import com.google.protobuf.AbstractC5062A0;
import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.C5075M;
import com.google.protobuf.C5076N;
import com.google.protobuf.C5125s0;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: s5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7024f extends AbstractC5136y implements InterfaceC5083V {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    private static final C7024f DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC5097e0 PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private int bitField0_;
    private C5125s0 createTime_;
    private C5076N fields_ = C5076N.m22945d();
    private String name_ = "";
    private C5125s0 updateTime_;

    /* JADX INFO: renamed from: s5.f$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f28054a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f28054a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28054a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28054a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28054a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28054a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28054a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28054a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: s5.f$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: x */
        public b m30711x(Map map) {
            m23724r();
            ((C7024f) this.f19622b).m30702f0().putAll(map);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m30712y(String str) {
            m23724r();
            ((C7024f) this.f19622b).m30706l0(str);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public b m30713z(C5125s0 c5125s0) {
            m23724r();
            ((C7024f) this.f19622b).m30707m0(c5125s0);
            return this;
        }

        private b() {
            super(C7024f.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: s5.f$c */
    private static final class c {

        /* JADX INFO: renamed from: a */
        static final C5075M f28055a = C5075M.m22938d(AbstractC5062A0.b.f19275v, "", AbstractC5062A0.b.f19277x, C7039u.m31031o0());
    }

    static {
        C7024f c7024f = new C7024f();
        DEFAULT_INSTANCE = c7024f;
        AbstractC5136y.m23695V(C7024f.class, c7024f);
    }

    private C7024f() {
    }

    /* JADX INFO: renamed from: d0 */
    public static C7024f m30701d0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public Map m30702f0() {
        return m30704j0();
    }

    /* JADX INFO: renamed from: i0 */
    private C5076N m30703i0() {
        return this.fields_;
    }

    /* JADX INFO: renamed from: j0 */
    private C5076N m30704j0() {
        if (!this.fields_.m22949h()) {
            this.fields_ = this.fields_.m22952l();
        }
        return this.fields_;
    }

    /* JADX INFO: renamed from: k0 */
    public static b m30705k0() {
        return (b) DEFAULT_INSTANCE.m23715u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public void m30706l0(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public void m30707m0(C5125s0 c5125s0) {
        c5125s0.getClass();
        this.updateTime_ = c5125s0;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: e0 */
    public Map m30708e0() {
        return Collections.unmodifiableMap(m30703i0());
    }

    /* JADX INFO: renamed from: g0 */
    public String m30709g0() {
        return this.name_;
    }

    /* JADX INFO: renamed from: h0 */
    public C5125s0 m30710h0() {
        C5125s0 c5125s0 = this.updateTime_;
        return c5125s0 == null ? C5125s0.m23581c0() : c5125s0;
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f28054a[dVar.ordinal()]) {
            case 1:
                return new C7024f();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u00022\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "name_", "fields_", c.f28055a, "createTime_", "updateTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C7024f.class) {
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
