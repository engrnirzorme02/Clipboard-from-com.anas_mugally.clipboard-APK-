package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.L */
/* JADX INFO: loaded from: classes.dex */
final class C5074L implements InterfaceC5115n0 {

    /* JADX INFO: renamed from: b */
    private static final InterfaceC5081T f19334b = new a();

    /* JADX INFO: renamed from: a */
    private final InterfaceC5081T f19335a;

    /* JADX INFO: renamed from: com.google.protobuf.L$a */
    class a implements InterfaceC5081T {
        a() {
        }

        @Override // com.google.protobuf.InterfaceC5081T
        /* JADX INFO: renamed from: a */
        public InterfaceC5080S mo22935a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.protobuf.InterfaceC5081T
        /* JADX INFO: renamed from: b */
        public boolean mo22936b(Class cls) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.L$b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f19336a;

        static {
            int[] iArr = new int[EnumC5101g0.values().length];
            f19336a = iArr;
            try {
                iArr[EnumC5101g0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.L$c */
    private static class c implements InterfaceC5081T {

        /* JADX INFO: renamed from: a */
        private InterfaceC5081T[] f19337a;

        c(InterfaceC5081T... interfaceC5081TArr) {
            this.f19337a = interfaceC5081TArr;
        }

        @Override // com.google.protobuf.InterfaceC5081T
        /* JADX INFO: renamed from: a */
        public InterfaceC5080S mo22935a(Class cls) {
            for (InterfaceC5081T interfaceC5081T : this.f19337a) {
                if (interfaceC5081T.mo22936b(cls)) {
                    return interfaceC5081T.mo22935a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.protobuf.InterfaceC5081T
        /* JADX INFO: renamed from: b */
        public boolean mo22936b(Class cls) {
            for (InterfaceC5081T interfaceC5081T : this.f19337a) {
                if (interfaceC5081T.mo22936b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C5074L() {
        this(m22931c());
    }

    /* JADX INFO: renamed from: b */
    private static boolean m22930b(InterfaceC5080S interfaceC5080S) {
        return b.f19336a[interfaceC5080S.mo22968c().ordinal()] != 1;
    }

    /* JADX INFO: renamed from: c */
    private static InterfaceC5081T m22931c() {
        return new c(C5134x.m23675c(), m22932d());
    }

    /* JADX INFO: renamed from: d */
    private static InterfaceC5081T m22932d() {
        try {
            return (InterfaceC5081T) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f19334b;
        }
    }

    /* JADX INFO: renamed from: e */
    private static InterfaceC5113m0 m22933e(Class cls, InterfaceC5080S interfaceC5080S) {
        if (AbstractC5136y.class.isAssignableFrom(cls)) {
            return m22930b(interfaceC5080S) ? C5085X.m23002S(cls, interfaceC5080S, AbstractC5091b0.m23080b(), AbstractC5072J.m22921b(), AbstractC5117o0.m23485K(), AbstractC5126t.m23590b(), AbstractC5079Q.m22964b()) : C5085X.m23002S(cls, interfaceC5080S, AbstractC5091b0.m23080b(), AbstractC5072J.m22921b(), AbstractC5117o0.m23485K(), null, AbstractC5079Q.m22964b());
        }
        return m22930b(interfaceC5080S) ? C5085X.m23002S(cls, interfaceC5080S, AbstractC5091b0.m23079a(), AbstractC5072J.m22920a(), AbstractC5117o0.m23484J(), AbstractC5126t.m23589a(), AbstractC5079Q.m22963a()) : C5085X.m23002S(cls, interfaceC5080S, AbstractC5091b0.m23079a(), AbstractC5072J.m22920a(), AbstractC5117o0.m23484J(), null, AbstractC5079Q.m22963a());
    }

    @Override // com.google.protobuf.InterfaceC5115n0
    /* JADX INFO: renamed from: a */
    public InterfaceC5113m0 mo22934a(Class cls) {
        AbstractC5117o0.m23481G(cls);
        InterfaceC5080S interfaceC5080SMo22935a = this.f19335a.mo22935a(cls);
        if (interfaceC5080SMo22935a.mo22966a()) {
            return AbstractC5136y.class.isAssignableFrom(cls) ? C5086Y.m23064m(AbstractC5117o0.m23485K(), AbstractC5126t.m23590b(), interfaceC5080SMo22935a.mo22967b()) : C5086Y.m23064m(AbstractC5117o0.m23484J(), AbstractC5126t.m23589a(), interfaceC5080SMo22935a.mo22967b());
        }
        return m22933e(cls, interfaceC5080SMo22935a);
    }

    private C5074L(InterfaceC5081T interfaceC5081T) {
        this.f19335a = (InterfaceC5081T) AbstractC5063B.m22838b(interfaceC5081T, "messageInfoFactory");
    }
}
