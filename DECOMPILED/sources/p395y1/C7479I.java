package p395y1;

import android.content.Context;
import androidx.lifecycle.AbstractC2632Y;
import androidx.lifecycle.AbstractC2633Z;
import androidx.lifecycle.C2611C;
import com.anas_mugally.clipboard.database.AppDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6087b;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p152T5.AbstractC1631j;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p225d1.C5210b;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6615I0;
import p318o6.AbstractC6668i;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.InterfaceC6624N;
import p318o6.InterfaceC6701y0;

/* JADX INFO: renamed from: y1.I */
/* JADX INFO: loaded from: classes.dex */
public final class C7479I extends AbstractC2632Y {

    /* JADX INFO: renamed from: e */
    public static final a f30033e = new a(null);

    /* JADX INFO: renamed from: b */
    private C2611C f30034b = new C2611C();

    /* JADX INFO: renamed from: c */
    private C2611C f30035c = new C2611C();

    /* JADX INFO: renamed from: d */
    private InterfaceC6701y0 f30036d;

    /* JADX INFO: renamed from: y1.I$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: y1.I$b */
    static final class b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f30037a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f30038b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C7479I f30039c;

        /* JADX INFO: renamed from: y1.I$b$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f30040a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C7479I f30041b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C7479I c7479i, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f30041b = c7479i;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f30041b, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f30040a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                this.f30041b.m33127i().mo12526q(AbstractC1638q.m6765j());
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, C7479I c7479i, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f30038b = context;
            this.f30039c = c7479i;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return new b(this.f30038b, this.f30039c, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f30037a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                AppDatabase.f12597p.m15148b(this.f30038b).mo15145F().mo14853b();
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar = new a(this.f30039c, null);
                this.f30037a = 1;
                if (AbstractC6668i.m28186g(abstractC6615I0M28164c, aVar, this) == objE) {
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

    /* JADX INFO: renamed from: y1.I$c */
    static final class c extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f30042a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f30043b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f30044c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, long j7, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f30043b = context;
            this.f30044c = j7;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return new c(this.f30043b, this.f30044c, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((c) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f30042a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            AppDatabase.f12597p.m15148b(this.f30043b).mo15145F().mo14854c(System.currentTimeMillis(), this.f30044c);
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: y1.I$d */
    static final class d extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f30045a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f30046b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Integer[] f30047c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C7479I f30048d;

        /* JADX INFO: renamed from: y1.I$d$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f30049a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C7479I f30050b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ Integer[] f30051c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C7479I c7479i, Integer[] numArr, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f30050b = c7479i;
                this.f30051c = numArr;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f30050b, this.f30051c, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                ArrayList arrayList;
                AbstractC2005b.m8369e();
                if (this.f30049a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                C2611C c2611cM33127i = this.f30050b.m33127i();
                List list = (List) this.f30050b.m33127i().m12669f();
                if (list != null) {
                    Integer[] numArr = this.f30051c;
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!AbstractC1631j.m6744q(numArr, AbstractC6087b.m27122c(((C5210b) obj2).m24104a()))) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                c2611cM33127i.mo12526q(arrayList);
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, Integer[] numArr, C7479I c7479i, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f30046b = context;
            this.f30047c = numArr;
            this.f30048d = c7479i;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return new d(this.f30046b, this.f30047c, this.f30048d, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((d) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f30045a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                AppDatabase.f12597p.m15148b(this.f30046b).mo15145F().mo14852a(AbstractC1631j.m6734e0(this.f30047c));
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar = new a(this.f30048d, this.f30047c, null);
                this.f30045a = 1;
                if (AbstractC6668i.m28186g(abstractC6615I0M28164c, aVar, this) == objE) {
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

    /* JADX INFO: renamed from: y1.I$e */
    static final class e extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f30052a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f30053b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f30054c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f30055d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f30056e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ boolean f30057f;

        /* JADX INFO: renamed from: r */
        final /* synthetic */ C7479I f30058r;

        /* JADX INFO: renamed from: y1.I$e$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f30059a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ boolean f30060b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C7479I f30061c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ List f30062d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ int f30063e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z7, C7479I c7479i, List list, int i7, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f30060b = z7;
                this.f30061c = c7479i;
                this.f30062d = list;
                this.f30063e = i7;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f30060b, this.f30061c, this.f30062d, this.f30063e, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f30059a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                List listJ = !this.f30060b ? (List) this.f30061c.m33127i().m12669f() : AbstractC1638q.m6765j();
                C2611C c2611cM33127i = this.f30061c.m33127i();
                AbstractC6118n.m27184b(listJ);
                c2611cM33127i.mo12526q(AbstractC1638q.m6582V(listJ, this.f30062d));
                this.f30061c.m33126h().mo12526q(AbstractC6087b.m27120a(this.f30062d.size() == this.f30063e));
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, int i7, String str, int i8, boolean z7, C7479I c7479i, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f30053b = context;
            this.f30054c = i7;
            this.f30055d = str;
            this.f30056e = i8;
            this.f30057f = z7;
            this.f30058r = c7479i;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return new e(this.f30053b, this.f30054c, this.f30055d, this.f30056e, this.f30057f, this.f30058r, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((e) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f30052a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                List listMo14855d = AppDatabase.f12597p.m15148b(this.f30053b).mo15145F().mo14855d(AbstractC6087b.m27122c(this.f30054c), this.f30055d, this.f30056e);
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar = new a(this.f30057f, this.f30058r, listMo14855d, this.f30056e, null);
                this.f30052a = 1;
                if (AbstractC6668i.m28186g(abstractC6615I0M28164c, aVar, this) == objE) {
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

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m33122k(C7479I c7479i, Context context, String str, boolean z7, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i9 & 16) != 0) {
            i8 = 300;
        }
        c7479i.m33128j(context, str2, z7, i7, i8);
    }

    /* JADX INFO: renamed from: e */
    public final void m33123e(Context context) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6672k.m28227d(AbstractC2633Z.m12590a(this), C6656c0.m28163b(), null, new b(context, this, null), 2, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m33124f(Context context, long j7) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6672k.m28227d(AbstractC2633Z.m12590a(this), C6656c0.m28163b(), null, new c(context, j7, null), 2, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m33125g(Context context, Integer[] array) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(array, "array");
        AbstractC6672k.m28227d(AbstractC2633Z.m12590a(this), C6656c0.m28163b(), null, new d(context, array, this, null), 2, null);
    }

    /* JADX INFO: renamed from: h */
    public final C2611C m33126h() {
        return this.f30035c;
    }

    /* JADX INFO: renamed from: i */
    public final C2611C m33127i() {
        return this.f30034b;
    }

    /* JADX INFO: renamed from: j */
    public final void m33128j(Context context, String str, boolean z7, int i7, int i8) {
        AbstractC6118n.m27187e(context, "context");
        InterfaceC6701y0 interfaceC6701y0 = this.f30036d;
        if (interfaceC6701y0 != null) {
            InterfaceC6701y0.a.m28291b(interfaceC6701y0, null, 1, null);
        }
        this.f30036d = AbstractC6672k.m28227d(AbstractC2633Z.m12590a(this), C6656c0.m28163b(), null, new e(context, i7, str, i8, z7, this, null), 2, null);
    }
}
