package p174X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6099B;
import p145S5.AbstractC1423a;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;

/* JADX INFO: renamed from: X.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1904h {

    /* JADX INFO: renamed from: a */
    public static final a f6107a = new a(null);

    /* JADX INFO: renamed from: X.h$a */
    public static final class a {

        /* JADX INFO: renamed from: X.h$a$a, reason: collision with other inner class name */
        static final class C7653a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f6108a;

            /* JADX INFO: renamed from: b */
            /* synthetic */ Object f6109b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ List f6110c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7653a(List list, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f6110c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                C7653a c7653a = new C7653a(this.f6110c, interfaceC1875e);
                c7653a.f6109b = obj;
                return c7653a;
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC1915s interfaceC1915s, InterfaceC1875e interfaceC1875e) {
                return ((C7653a) create(interfaceC1915s, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                Object objE = AbstractC2005b.m8369e();
                int i7 = this.f6108a;
                if (i7 == 0) {
                    AbstractC1437o.m6082b(obj);
                    InterfaceC1915s interfaceC1915s = (InterfaceC1915s) this.f6109b;
                    a aVar = AbstractC1904h.f6107a;
                    List list = this.f6110c;
                    this.f6108a = 1;
                    if (aVar.m7845c(list, interfaceC1915s, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
                return C1444v.f4971a;
            }
        }

        /* JADX INFO: renamed from: X.h$a$b */
        static final class b extends AbstractC6089d {

            /* JADX INFO: renamed from: a */
            Object f6111a;

            /* JADX INFO: renamed from: b */
            Object f6112b;

            /* JADX INFO: renamed from: c */
            /* synthetic */ Object f6113c;

            /* JADX INFO: renamed from: e */
            int f6115e;

            b(InterfaceC1875e interfaceC1875e) {
                super(interfaceC1875e);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                this.f6113c = obj;
                this.f6115e |= Integer.MIN_VALUE;
                return a.this.m7845c(null, null, this);
            }
        }

        /* JADX INFO: renamed from: X.h$a$c */
        static final class c extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            Object f6116a;

            /* JADX INFO: renamed from: b */
            Object f6117b;

            /* JADX INFO: renamed from: c */
            Object f6118c;

            /* JADX INFO: renamed from: d */
            int f6119d;

            /* JADX INFO: renamed from: e */
            /* synthetic */ Object f6120e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ List f6121f;

            /* JADX INFO: renamed from: r */
            final /* synthetic */ List f6122r;

            /* JADX INFO: renamed from: X.h$a$c$a, reason: collision with other inner class name */
            static final class C7654a extends AbstractC6097l implements InterfaceC5367l {

                /* JADX INFO: renamed from: a */
                int f6123a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ InterfaceC1903g f6124b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C7654a(InterfaceC1903g interfaceC1903g, InterfaceC1875e interfaceC1875e) {
                    super(1, interfaceC1875e);
                    this.f6124b = interfaceC1903g;
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
                public final InterfaceC1875e create(InterfaceC1875e interfaceC1875e) {
                    return new C7654a(this.f6124b, interfaceC1875e);
                }

                @Override // p238e6.InterfaceC5367l
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC1875e interfaceC1875e) {
                    return ((C7654a) create(interfaceC1875e)).invokeSuspend(C1444v.f4971a);
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
                public final Object invokeSuspend(Object obj) {
                    Object objE = AbstractC2005b.m8369e();
                    int i7 = this.f6123a;
                    if (i7 == 0) {
                        AbstractC1437o.m6082b(obj);
                        InterfaceC1903g interfaceC1903g = this.f6124b;
                        this.f6123a = 1;
                        if (interfaceC1903g.mo7842b(this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1437o.m6082b(obj);
                    }
                    return C1444v.f4971a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(List list, List list2, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f6121f = list;
                this.f6122r = list2;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                c cVar = new c(this.f6121f, this.f6122r, interfaceC1875e);
                cVar.f6120e = obj;
                return cVar;
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, InterfaceC1875e interfaceC1875e) {
                return ((c) create(obj, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            /* JADX WARN: Code duplicated, block: B:13:0x004a  */
            /* JADX WARN: Code duplicated, block: B:16:0x0061  */
            /* JADX WARN: Code duplicated, block: B:19:0x006e  */
            /* JADX WARN: Code duplicated, block: B:22:0x0088  */
            /* JADX WARN: Code duplicated, block: B:23:0x008a  */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = p180X5.AbstractC2005b.m8369e()
                    int r1 = r9.f6119d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r1 = r9.f6116a
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r9.f6120e
                    java.util.List r4 = (java.util.List) r4
                    p145S5.AbstractC1437o.m6082b(r10)
                    goto L44
                L1a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L22:
                    java.lang.Object r1 = r9.f6118c
                    java.lang.Object r4 = r9.f6117b
                    X.g r4 = (p174X.InterfaceC1903g) r4
                    java.lang.Object r5 = r9.f6116a
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r9.f6120e
                    java.util.List r6 = (java.util.List) r6
                    p145S5.AbstractC1437o.m6082b(r10)
                    r8 = r6
                    r6 = r4
                    r4 = r8
                    goto L66
                L37:
                    p145S5.AbstractC1437o.m6082b(r10)
                    java.lang.Object r10 = r9.f6120e
                    java.util.List r1 = r9.f6121f
                    java.util.List r4 = r9.f6122r
                    java.util.Iterator r1 = r1.iterator()
                L44:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L8c
                    java.lang.Object r5 = r1.next()
                    X.g r5 = (p174X.InterfaceC1903g) r5
                    r9.f6120e = r4
                    r9.f6116a = r1
                    r9.f6117b = r5
                    r9.f6118c = r10
                    r9.f6119d = r3
                    java.lang.Object r6 = r5.mo7841a(r10, r9)
                    if (r6 != r0) goto L61
                    goto L87
                L61:
                    r8 = r1
                    r1 = r10
                    r10 = r6
                    r6 = r5
                    r5 = r8
                L66:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L8a
                    X.h$a$c$a r10 = new X.h$a$c$a
                    r7 = 0
                    r10.<init>(r6, r7)
                    r4.add(r10)
                    r9.f6120e = r4
                    r9.f6116a = r5
                    r9.f6117b = r7
                    r9.f6118c = r7
                    r9.f6119d = r2
                    java.lang.Object r10 = r6.mo7843c(r1, r9)
                    if (r10 != r0) goto L88
                L87:
                    return r0
                L88:
                    r1 = r5
                    goto L44
                L8a:
                    r10 = r1
                    goto L88
                L8c:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: p174X.AbstractC1904h.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:27:0x006f  */
        /* JADX WARN: Code duplicated, block: B:37:0x0098  */
        /* JADX WARN: Code duplicated, block: B:39:0x009b  */
        /* JADX WARN: Code duplicated, block: B:43:0x0081 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0069->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0086 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0089 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /* JADX INFO: renamed from: c */
        public final Object m7845c(List list, InterfaceC1915s interfaceC1915s, InterfaceC1875e interfaceC1875e) throws Throwable {
            b bVar;
            List list2;
            C6099B c6099b;
            Iterator it;
            Throwable th;
            InterfaceC5367l interfaceC5367l;
            if (interfaceC1875e instanceof b) {
                bVar = (b) interfaceC1875e;
                int i7 = bVar.f6115e;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    bVar.f6115e = i7 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(interfaceC1875e);
                }
            } else {
                bVar = new b(interfaceC1875e);
            }
            Object obj = bVar.f6113c;
            Object objE = AbstractC2005b.m8369e();
            int i8 = bVar.f6115e;
            if (i8 == 0) {
                AbstractC1437o.m6082b(obj);
                ArrayList arrayList = new ArrayList();
                InterfaceC5371p cVar = new c(list, arrayList, null);
                bVar.f6111a = arrayList;
                bVar.f6115e = 1;
                if (interfaceC1915s.mo7884a(cVar, bVar) != objE) {
                    list2 = arrayList;
                }
                return objE;
            }
            if (i8 == 1) {
                list2 = (List) bVar.f6111a;
                AbstractC1437o.m6082b(obj);
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) bVar.f6112b;
                c6099b = (C6099B) bVar.f6111a;
                try {
                    AbstractC1437o.m6082b(obj);
                } catch (Throwable th2) {
                    Object obj2 = c6099b.f23859a;
                    if (obj2 == null) {
                        c6099b.f23859a = th2;
                    } else {
                        AbstractC6118n.m27184b(obj2);
                        AbstractC1423a.m6060a((Throwable) obj2, th2);
                    }
                }
            }
            while (it.hasNext()) {
                interfaceC5367l = (InterfaceC5367l) it.next();
                bVar.f6111a = c6099b;
                bVar.f6112b = it;
                bVar.f6115e = 2;
                if (interfaceC5367l.invoke(bVar) == objE) {
                    return objE;
                }
            }
            th = (Throwable) c6099b.f23859a;
            if (th == null) {
                return C1444v.f4971a;
            }
            throw th;
            c6099b = new C6099B();
            it = list2.iterator();
            while (it.hasNext()) {
                interfaceC5367l = (InterfaceC5367l) it.next();
                bVar.f6111a = c6099b;
                bVar.f6112b = it;
                bVar.f6115e = 2;
                if (interfaceC5367l.invoke(bVar) == objE) {
                    return objE;
                }
            }
            th = (Throwable) c6099b.f23859a;
            if (th == null) {
                return C1444v.f4971a;
            }
            throw th;
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC5371p m7846b(List migrations) {
            AbstractC6118n.m27187e(migrations, "migrations");
            return new C7653a(migrations, null);
        }

        private a() {
        }
    }
}
