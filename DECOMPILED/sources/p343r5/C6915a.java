package p343r5;

import com.google.protobuf.AbstractC5063B;
import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;
import java.util.List;

/* JADX INFO: renamed from: r5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6915a extends AbstractC5136y implements InterfaceC5083V {
    private static final C6915a DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC5097e0 PARSER = null;
    public static final int QUERY_SCOPE_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 4;
    private int queryScope_;
    private int state_;
    private String name_ = "";
    private AbstractC5063B.e fields_ = AbstractC5136y.m23683A();

    /* JADX INFO: renamed from: r5.a$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f27757a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f27757a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27757a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27757a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27757a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27757a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27757a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27757a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: r5.a$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: x */
        public b m30329x(c.b bVar) {
            m23724r();
            ((C6915a) this.f19622b).m30323c0((c) bVar.m23721o());
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m30330y(d dVar) {
            m23724r();
            ((C6915a) this.f19622b).m30327h0(dVar);
            return this;
        }

        private b() {
            super(C6915a.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: r5.a$c */
    public static final class c extends AbstractC5136y implements InterfaceC5083V {
        public static final int ARRAY_CONFIG_FIELD_NUMBER = 3;
        private static final c DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int ORDER_FIELD_NUMBER = 2;
        private static volatile InterfaceC5097e0 PARSER;
        private Object valueMode_;
        private int valueModeCase_ = 0;
        private String fieldPath_ = "";

        /* JADX INFO: renamed from: r5.a$c$a */
        public enum a implements AbstractC5063B.a {
            ARRAY_CONFIG_UNSPECIFIED(0),
            CONTAINS(1),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: e */
            private static final AbstractC5063B.b f27761e = new C7719a();

            /* JADX INFO: renamed from: a */
            private final int f27763a;

            /* JADX INFO: renamed from: r5.a$c$a$a, reason: collision with other inner class name */
            class C7719a implements AbstractC5063B.b {
                C7719a() {
                }
            }

            a(int i7) {
                this.f27763a = i7;
            }

            @Override // com.google.protobuf.AbstractC5063B.a
            /* JADX INFO: renamed from: a */
            public final int mo22846a() {
                if (this != UNRECOGNIZED) {
                    return this.f27763a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* JADX INFO: renamed from: r5.a$c$b */
        public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
            /* synthetic */ b(a aVar) {
                this();
            }

            /* JADX INFO: renamed from: x */
            public b m30343x(a aVar) {
                m23724r();
                ((c) this.f19622b).m30336h0(aVar);
                return this;
            }

            /* JADX INFO: renamed from: y */
            public b m30344y(String str) {
                m23724r();
                ((c) this.f19622b).m30337i0(str);
                return this;
            }

            /* JADX INFO: renamed from: z */
            public b m30345z(EnumC7720c enumC7720c) {
                m23724r();
                ((c) this.f19622b).m30338j0(enumC7720c);
                return this;
            }

            private b() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: renamed from: r5.a$c$c, reason: collision with other inner class name */
        public enum EnumC7720c implements AbstractC5063B.a {
            ORDER_UNSPECIFIED(0),
            ASCENDING(1),
            DESCENDING(2),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: f */
            private static final AbstractC5063B.b f27768f = new a();

            /* JADX INFO: renamed from: a */
            private final int f27770a;

            /* JADX INFO: renamed from: r5.a$c$c$a */
            class a implements AbstractC5063B.b {
                a() {
                }
            }

            EnumC7720c(int i7) {
                this.f27770a = i7;
            }

            /* JADX INFO: renamed from: d */
            public static EnumC7720c m30347d(int i7) {
                if (i7 == 0) {
                    return ORDER_UNSPECIFIED;
                }
                if (i7 == 1) {
                    return ASCENDING;
                }
                if (i7 != 2) {
                    return null;
                }
                return DESCENDING;
            }

            @Override // com.google.protobuf.AbstractC5063B.a
            /* JADX INFO: renamed from: a */
            public final int mo22846a() {
                if (this != UNRECOGNIZED) {
                    return this.f27770a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* JADX INFO: renamed from: r5.a$c$d */
        public enum d {
            ORDER(2),
            ARRAY_CONFIG(3),
            VALUEMODE_NOT_SET(0);


            /* JADX INFO: renamed from: a */
            private final int f27775a;

            d(int i7) {
                this.f27775a = i7;
            }

            /* JADX INFO: renamed from: d */
            public static d m30349d(int i7) {
                if (i7 == 0) {
                    return VALUEMODE_NOT_SET;
                }
                if (i7 == 2) {
                    return ORDER;
                }
                if (i7 != 3) {
                    return null;
                }
                return ARRAY_CONFIG;
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC5136y.m23695V(c.class, cVar);
        }

        private c() {
        }

        /* JADX INFO: renamed from: g0 */
        public static b m30335g0() {
            return (b) DEFAULT_INSTANCE.m23715u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h0 */
        public void m30336h0(a aVar) {
            this.valueMode_ = Integer.valueOf(aVar.mo22846a());
            this.valueModeCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i0 */
        public void m30337i0(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j0 */
        public void m30338j0(EnumC7720c enumC7720c) {
            this.valueMode_ = Integer.valueOf(enumC7720c.mo22846a());
            this.valueModeCase_ = 2;
        }

        /* JADX INFO: renamed from: d0 */
        public String m30339d0() {
            return this.fieldPath_;
        }

        /* JADX INFO: renamed from: e0 */
        public EnumC7720c m30340e0() {
            if (this.valueModeCase_ != 2) {
                return EnumC7720c.ORDER_UNSPECIFIED;
            }
            EnumC7720c enumC7720cM30347d = EnumC7720c.m30347d(((Integer) this.valueMode_).intValue());
            return enumC7720cM30347d == null ? EnumC7720c.UNRECOGNIZED : enumC7720cM30347d;
        }

        /* JADX INFO: renamed from: f0 */
        public d m30341f0() {
            return d.m30349d(this.valueModeCase_);
        }

        @Override // com.google.protobuf.AbstractC5136y
        /* JADX INFO: renamed from: y */
        protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
            InterfaceC5097e0 bVar;
            a aVar = null;
            switch (a.f27757a[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new b(aVar);
                case 3:
                    return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003?\u0000", new Object[]{"valueMode_", "valueModeCase_", "fieldPath_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC5097e0 interfaceC5097e0 = PARSER;
                    if (interfaceC5097e0 != null) {
                        return interfaceC5097e0;
                    }
                    synchronized (c.class) {
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

    /* JADX INFO: renamed from: r5.a$d */
    public enum d implements AbstractC5063B.a {
        QUERY_SCOPE_UNSPECIFIED(0),
        COLLECTION(1),
        COLLECTION_GROUP(2),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: f */
        private static final AbstractC5063B.b f27780f = new a();

        /* JADX INFO: renamed from: a */
        private final int f27782a;

        /* JADX INFO: renamed from: r5.a$d$a */
        class a implements AbstractC5063B.b {
            a() {
            }
        }

        d(int i7) {
            this.f27782a = i7;
        }

        @Override // com.google.protobuf.AbstractC5063B.a
        /* JADX INFO: renamed from: a */
        public final int mo22846a() {
            if (this != UNRECOGNIZED) {
                return this.f27782a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        C6915a c6915a = new C6915a();
        DEFAULT_INSTANCE = c6915a;
        AbstractC5136y.m23695V(C6915a.class, c6915a);
    }

    private C6915a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public void m30323c0(c cVar) {
        cVar.getClass();
        m30324d0();
        this.fields_.add(cVar);
    }

    /* JADX INFO: renamed from: d0 */
    private void m30324d0() {
        AbstractC5063B.e eVar = this.fields_;
        if (eVar.mo22849h()) {
            return;
        }
        this.fields_ = AbstractC5136y.m23687L(eVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static b m30325f0() {
        return (b) DEFAULT_INSTANCE.m23715u();
    }

    /* JADX INFO: renamed from: g0 */
    public static C6915a m30326g0(byte[] bArr) {
        return (C6915a) AbstractC5136y.m23691R(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public void m30327h0(d dVar) {
        this.queryScope_ = dVar.mo22846a();
    }

    /* JADX INFO: renamed from: e0 */
    public List m30328e0() {
        return this.fields_;
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f27757a[dVar.ordinal()]) {
            case 1:
                return new C6915a();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\f", new Object[]{"name_", "queryScope_", "fields_", c.class, "state_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C6915a.class) {
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
