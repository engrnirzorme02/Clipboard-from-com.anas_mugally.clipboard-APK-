package p344r6;

import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.jvm.internal.AbstractC6117m;
import kotlin.jvm.internal.C6128x;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p352s6.AbstractC7053j;
import p352s6.C7044a;

/* JADX INFO: renamed from: r6.l */
/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class AbstractC6927l {

    /* JADX INFO: renamed from: r6.l$a */
    public static final class a implements InterfaceC6918c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC6918c f27828a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5371p f27829b;

        public a(InterfaceC6918c interfaceC6918c, InterfaceC5371p interfaceC5371p) {
            this.f27828a = interfaceC6918c;
            this.f27829b = interfaceC5371p;
        }

        @Override // p344r6.InterfaceC6918c
        /* JADX INFO: renamed from: a */
        public Object mo7891a(InterfaceC6919d interfaceC6919d, InterfaceC1875e interfaceC1875e) {
            Object objMo7891a = this.f27828a.mo7891a(new b(new C6128x(), interfaceC6919d, this.f27829b), interfaceC1875e);
            return objMo7891a == AbstractC2005b.m8369e() ? objMo7891a : C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: r6.l$b */
    static final class b implements InterfaceC6919d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C6128x f27830a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC6919d f27831b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC5371p f27832c;

        /* JADX INFO: renamed from: r6.l$b$a */
        static final class a extends AbstractC6089d {

            /* JADX INFO: renamed from: a */
            Object f27833a;

            /* JADX INFO: renamed from: b */
            Object f27834b;

            /* JADX INFO: renamed from: c */
            /* synthetic */ Object f27835c;

            /* JADX INFO: renamed from: e */
            int f27837e;

            a(InterfaceC1875e interfaceC1875e) {
                super(interfaceC1875e);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                this.f27835c = obj;
                this.f27837e |= Integer.MIN_VALUE;
                return b.this.mo7892d(null, this);
            }
        }

        b(C6128x c6128x, InterfaceC6919d interfaceC6919d, InterfaceC5371p interfaceC5371p) {
            this.f27830a = c6128x;
            this.f27831b = interfaceC6919d;
            this.f27832c = interfaceC5371p;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0074  */
        /* JADX WARN: Code duplicated, block: B:36:0x008b  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            if (r8.mo7892d(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
        
            if (r8.mo7892d(r7, r0) == r1) goto L33;
         */
        @Override // p344r6.InterfaceC6919d
        /* JADX INFO: renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo7892d(Object obj, InterfaceC1875e interfaceC1875e) {
            a aVar;
            b bVar;
            if (interfaceC1875e instanceof a) {
                aVar = (a) interfaceC1875e;
                int i7 = aVar.f27837e;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    aVar.f27837e = i7 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(interfaceC1875e);
                }
            } else {
                aVar = new a(interfaceC1875e);
            }
            Object objInvoke = aVar.f27835c;
            Object objE = AbstractC2005b.m8369e();
            int i8 = aVar.f27837e;
            if (i8 != 0) {
                if (i8 == 1) {
                    AbstractC1437o.m6082b(objInvoke);
                    return C1444v.f4971a;
                }
                if (i8 == 2) {
                    obj = aVar.f27834b;
                    bVar = (b) aVar.f27833a;
                    AbstractC1437o.m6082b(objInvoke);
                    if (!((Boolean) objInvoke).booleanValue()) {
                        return C1444v.f4971a;
                    }
                    bVar.f27830a.f23885a = true;
                    InterfaceC6919d interfaceC6919d = bVar.f27831b;
                    aVar.f27833a = null;
                    aVar.f27834b = null;
                    aVar.f27837e = 3;
                } else {
                    if (i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(objInvoke);
                }
                return C1444v.f4971a;
            }
            AbstractC1437o.m6082b(objInvoke);
            if (this.f27830a.f23885a) {
                InterfaceC6919d interfaceC6919d2 = this.f27831b;
                aVar.f27837e = 1;
            } else {
                InterfaceC5371p interfaceC5371p = this.f27832c;
                aVar.f27833a = this;
                aVar.f27834b = obj;
                aVar.f27837e = 2;
                objInvoke = interfaceC5371p.invoke(obj, aVar);
                if (objInvoke != objE) {
                    bVar = this;
                    if (!((Boolean) objInvoke).booleanValue()) {
                        return C1444v.f4971a;
                    }
                    bVar.f27830a.f23885a = true;
                    InterfaceC6919d interfaceC6919d3 = bVar.f27831b;
                    aVar.f27833a = null;
                    aVar.f27834b = null;
                    aVar.f27837e = 3;
                }
            }
            return objE;
        }
    }

    /* JADX INFO: renamed from: r6.l$c */
    public static final class c implements InterfaceC6918c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC6918c f27838a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5371p f27839b;

        /* JADX INFO: renamed from: r6.l$c$a */
        public static final class a extends AbstractC6089d {

            /* JADX INFO: renamed from: a */
            /* synthetic */ Object f27840a;

            /* JADX INFO: renamed from: b */
            int f27841b;

            /* JADX INFO: renamed from: d */
            Object f27843d;

            public a(InterfaceC1875e interfaceC1875e) {
                super(interfaceC1875e);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                this.f27840a = obj;
                this.f27841b |= Integer.MIN_VALUE;
                return c.this.mo7891a(null, this);
            }
        }

        public c(InterfaceC6918c interfaceC6918c, InterfaceC5371p interfaceC5371p) {
            this.f27838a = interfaceC6918c;
            this.f27839b = interfaceC5371p;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p344r6.InterfaceC6918c
        /* JADX INFO: renamed from: a */
        public Object mo7891a(InterfaceC6919d interfaceC6919d, InterfaceC1875e interfaceC1875e) {
            a aVar;
            d dVar;
            if (interfaceC1875e instanceof a) {
                aVar = (a) interfaceC1875e;
                int i7 = aVar.f27841b;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    aVar.f27841b = i7 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(interfaceC1875e);
                }
            } else {
                aVar = new a(interfaceC1875e);
            }
            Object obj = aVar.f27840a;
            Object objE = AbstractC2005b.m8369e();
            int i8 = aVar.f27841b;
            if (i8 == 0) {
                AbstractC1437o.m6082b(obj);
                InterfaceC6918c interfaceC6918c = this.f27838a;
                d dVar2 = new d(this.f27839b, interfaceC6919d);
                try {
                    aVar.f27843d = dVar2;
                    aVar.f27841b = 1;
                    if (interfaceC6918c.mo7891a(dVar2, aVar) == objE) {
                        return objE;
                    }
                } catch (C7044a e7) {
                    e = e7;
                    dVar = dVar2;
                    AbstractC7053j.m31140a(e, dVar);
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (d) aVar.f27843d;
                try {
                    AbstractC1437o.m6082b(obj);
                } catch (C7044a e8) {
                    e = e8;
                    AbstractC7053j.m31140a(e, dVar);
                }
            }
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: r6.l$d */
    public static final class d implements InterfaceC6919d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5371p f27844a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC6919d f27845b;

        /* JADX INFO: renamed from: r6.l$d$a */
        public static final class a extends AbstractC6089d {

            /* JADX INFO: renamed from: a */
            Object f27846a;

            /* JADX INFO: renamed from: b */
            /* synthetic */ Object f27847b;

            /* JADX INFO: renamed from: c */
            int f27848c;

            /* JADX INFO: renamed from: e */
            Object f27850e;

            public a(InterfaceC1875e interfaceC1875e) {
                super(interfaceC1875e);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                this.f27847b = obj;
                this.f27848c |= Integer.MIN_VALUE;
                return d.this.mo7892d(null, this);
            }
        }

        public d(InterfaceC5371p interfaceC5371p, InterfaceC6919d interfaceC6919d) {
            this.f27844a = interfaceC5371p;
            this.f27845b = interfaceC6919d;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0081  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        
            if (r2.mo7892d(r9, r0) == r1) goto L24;
         */
        @Override // p344r6.InterfaceC6919d
        /* JADX INFO: renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo7892d(Object obj, InterfaceC1875e interfaceC1875e) {
            a aVar;
            Object obj2;
            Object obj3;
            d dVar;
            if (interfaceC1875e instanceof a) {
                aVar = (a) interfaceC1875e;
                int i7 = aVar.f27848c;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    aVar.f27848c = i7 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(interfaceC1875e);
                }
            } else {
                aVar = new a(interfaceC1875e);
            }
            Object obj4 = aVar.f27847b;
            Object objE = AbstractC2005b.m8369e();
            int i8 = aVar.f27848c;
            boolean z7 = true;
            if (i8 == 0) {
                AbstractC1437o.m6082b(obj4);
                InterfaceC5371p interfaceC5371p = this.f27844a;
                aVar.f27846a = this;
                aVar.f27850e = obj;
                aVar.f27848c = 1;
                AbstractC6117m.m27182a(6);
                Object objInvoke = interfaceC5371p.invoke(obj, aVar);
                AbstractC6117m.m27182a(7);
                if (objInvoke != objE) {
                    obj2 = objInvoke;
                    obj3 = obj;
                    dVar = this;
                }
                return objE;
            }
            if (i8 == 1) {
                Object obj5 = aVar.f27850e;
                d dVar2 = (d) aVar.f27846a;
                AbstractC1437o.m6082b(obj4);
                obj3 = obj5;
                dVar = dVar2;
                obj2 = obj4;
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (d) aVar.f27846a;
                AbstractC1437o.m6082b(obj4);
            }
            if (z7) {
                return C1444v.f4971a;
            }
            throw new C7044a(dVar);
            if (((Boolean) obj2).booleanValue()) {
                InterfaceC6919d interfaceC6919d = dVar.f27845b;
                aVar.f27846a = dVar;
                aVar.f27850e = null;
                aVar.f27848c = 2;
            } else {
                z7 = false;
            }
            if (z7) {
                return C1444v.f4971a;
            }
            throw new C7044a(dVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC6918c m30389a(InterfaceC6918c interfaceC6918c, InterfaceC5371p interfaceC5371p) {
        return new a(interfaceC6918c, interfaceC5371p);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC6918c m30390b(InterfaceC6918c interfaceC6918c, InterfaceC5371p interfaceC5371p) {
        return new c(interfaceC6918c, interfaceC5371p);
    }
}
