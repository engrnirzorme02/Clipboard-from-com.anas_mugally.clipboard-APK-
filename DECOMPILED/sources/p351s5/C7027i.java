package p351s5;

import com.google.protobuf.AbstractC5063B;
import com.google.protobuf.AbstractC5136y;
import com.google.protobuf.InterfaceC5083V;
import com.google.protobuf.InterfaceC5097e0;

/* JADX INFO: renamed from: s5.i */
/* JADX INFO: loaded from: classes.dex */
public final class C7027i extends AbstractC5136y implements InterfaceC5083V {
    private static final C7027i DEFAULT_INSTANCE;
    public static final int FIELD_PATHS_FIELD_NUMBER = 1;
    private static volatile InterfaceC5097e0 PARSER;
    private AbstractC5063B.e fieldPaths_ = AbstractC5136y.m23683A();

    /* JADX INFO: renamed from: s5.i$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f28058a;

        static {
            int[] iArr = new int[AbstractC5136y.d.values().length];
            f28058a = iArr;
            try {
                iArr[AbstractC5136y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28058a[AbstractC5136y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28058a[AbstractC5136y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28058a[AbstractC5136y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28058a[AbstractC5136y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28058a[AbstractC5136y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28058a[AbstractC5136y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: s5.i$b */
    public static final class b extends AbstractC5136y.a implements InterfaceC5083V {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: x */
        public b m30732x(String str) {
            m23724r();
            ((C7027i) this.f19622b).m30726b0(str);
            return this;
        }

        private b() {
            super(C7027i.DEFAULT_INSTANCE);
        }
    }

    static {
        C7027i c7027i = new C7027i();
        DEFAULT_INSTANCE = c7027i;
        AbstractC5136y.m23695V(C7027i.class, c7027i);
    }

    private C7027i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public void m30726b0(String str) {
        str.getClass();
        m30727c0();
        this.fieldPaths_.add(str);
    }

    /* JADX INFO: renamed from: c0 */
    private void m30727c0() {
        AbstractC5063B.e eVar = this.fieldPaths_;
        if (eVar.mo22849h()) {
            return;
        }
        this.fieldPaths_ = AbstractC5136y.m23687L(eVar);
    }

    /* JADX INFO: renamed from: d0 */
    public static C7027i m30728d0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: g0 */
    public static b m30729g0() {
        return (b) DEFAULT_INSTANCE.m23715u();
    }

    /* JADX INFO: renamed from: e0 */
    public String m30730e0(int i7) {
        return (String) this.fieldPaths_.get(i7);
    }

    /* JADX INFO: renamed from: f0 */
    public int m30731f0() {
        return this.fieldPaths_.size();
    }

    @Override // com.google.protobuf.AbstractC5136y
    /* JADX INFO: renamed from: y */
    protected final Object mo7677y(AbstractC5136y.d dVar, Object obj, Object obj2) {
        InterfaceC5097e0 bVar;
        a aVar = null;
        switch (a.f28058a[dVar.ordinal()]) {
            case 1:
                return new C7027i();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5136y.m23688N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"fieldPaths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5097e0 interfaceC5097e0 = PARSER;
                if (interfaceC5097e0 != null) {
                    return interfaceC5097e0;
                }
                synchronized (C7027i.class) {
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
