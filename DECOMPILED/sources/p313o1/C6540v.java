package p313o1;

import android.content.Context;
import androidx.lifecycle.AbstractC2632Y;
import androidx.lifecycle.AbstractC2633Z;
import androidx.lifecycle.C2611C;
import com.anas_mugally.clipboard.database.AppDatabase;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1435m;
import p145S5.C1444v;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p187Y5.AbstractC2060b;
import p187Y5.InterfaceC2059a;
import p215c1.InterfaceC2983e;
import p225d1.C5209a;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6615I0;
import p318o6.AbstractC6668i;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.InterfaceC6624N;

/* JADX INFO: renamed from: o1.v */
/* JADX INFO: loaded from: classes.dex */
public final class C6540v extends AbstractC2632Y {

    /* JADX INFO: renamed from: c */
    public List f24673c;

    /* JADX INFO: renamed from: b */
    private C2611C f24672b = new C2611C();

    /* JADX INFO: renamed from: d */
    private C2611C f24674d = new C2611C();

    /* JADX INFO: renamed from: e */
    private C2611C f24675e = new C2611C(a.BY_CATEGORY);

    /* JADX INFO: renamed from: f */
    private C2611C f24676f = new C2611C();

    /* JADX INFO: renamed from: g */
    private C2611C f24677g = new C2611C(null);

    /* JADX INFO: renamed from: h */
    private Set f24678h = new LinkedHashSet();

    /* JADX INFO: renamed from: i */
    private List f24679i = AbstractC1638q.m6765j();

    /* JADX INFO: renamed from: o1.v$a */
    public enum a {
        ALL,
        TODAY,
        THIS_WEEK,
        THIS_MONTH,
        DATE_RANGE,
        BY_CATEGORY;


        /* JADX INFO: renamed from: s */
        private static final /* synthetic */ InterfaceC2059a f24687s = AbstractC2060b.m8524a(m27781c());
    }

    /* JADX INFO: renamed from: o1.v$b */
    static final class b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f24688a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f24689b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C6540v f24690c;

        /* JADX INFO: renamed from: o1.v$b$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f24691a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C6540v f24692b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ List f24693c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C6540v c6540v, List list, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f24692b = c6540v;
                this.f24693c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f24692b, this.f24693c, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f24691a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                this.f24692b.m27766i().mo12526q(this.f24693c);
                this.f24692b.m27778x(this.f24693c);
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, C6540v c6540v, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f24689b = context;
            this.f24690c = c6540v;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return new b(this.f24689b, this.f24690c, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f24688a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                List listMo14845e = AppDatabase.f12597p.m15148b(this.f24689b).mo15144E().mo14845e();
                C6540v c6540v = this.f24690c;
                int size = listMo14845e.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i8 = 0; i8 < size; i8++) {
                    arrayList.add(new C2611C());
                }
                c6540v.m27763A(arrayList);
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar = new a(this.f24690c, listMo14845e, null);
                this.f24688a = 1;
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

    /* JADX INFO: renamed from: o1.v$c */
    static final class c extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f24694a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f24695b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f24696c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C6540v f24697d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f24698e;

        /* JADX INFO: renamed from: o1.v$c$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f24699a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C6540v f24700b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ int f24701c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ List f24702d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C6540v c6540v, int i7, List list, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f24700b = c6540v;
                this.f24701c = i7;
                this.f24702d = list;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f24700b, this.f24701c, this.f24702d, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f24699a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                C2611C c2611c = (C2611C) AbstractC1638q.m6573M(this.f24700b.m27772p(), this.f24701c);
                if (c2611c != null) {
                    c2611c.mo12526q(this.f24702d);
                }
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, String str, C6540v c6540v, int i7, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f24695b = context;
            this.f24696c = str;
            this.f24697d = c6540v;
            this.f24698e = i7;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return new c(this.f24695b, this.f24696c, this.f24697d, this.f24698e, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((c) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f24694a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                List listMo14865f = AppDatabase.f12597p.m15148b(this.f24695b).mo15146G().mo14865f(this.f24696c);
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar = new a(this.f24697d, this.f24698e, listMo14865f, null);
                this.f24694a = 1;
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

    /* JADX INFO: renamed from: o1.v$d */
    static final class d extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f24703a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f24704b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f24705c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C6540v f24706d;

        /* JADX INFO: renamed from: o1.v$d$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f24707a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C6540v f24708b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ List f24709c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C6540v c6540v, List list, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f24708b = c6540v;
                this.f24709c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f24708b, this.f24709c, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f24707a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                this.f24708b.m27771o().mo12526q(this.f24709c);
                return C1444v.f4971a;
            }
        }

        /* JADX INFO: renamed from: o1.v$d$b */
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f24710a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.BY_CATEGORY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.TODAY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.THIS_WEEK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.THIS_MONTH.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.DATE_RANGE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f24710a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, String str, C6540v c6540v, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f24704b = context;
            this.f24705c = str;
            this.f24706d = c6540v;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return new d(this.f24704b, this.f24705c, this.f24706d, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((d) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code duplicated, block: B:56:0x011e  */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object next;
            List listJ;
            C1435m c1435m;
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f24703a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                InterfaceC2983e interfaceC2983eMo15146G = AppDatabase.f12597p.m15148b(this.f24704b).mo15146G();
                String str = this.f24705c;
                String str2 = (str == null || str.length() == 0) ? "%" : '%' + this.f24705c + '%';
                List listM27767j = this.f24706d.m27767j();
                C6540v c6540v = this.f24706d;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listM27767j) {
                    C5209a c5209a = (C5209a) obj2;
                    if (c5209a.m24102h() && !c6540v.m27773r().contains(c5209a.m24098d())) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC1638q.m6774s(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C5209a) it.next()).m24098d());
                }
                List listJ0 = AbstractC1638q.m6596j0(arrayList2);
                if (listJ0.isEmpty()) {
                    listJ0.add("___IMPOSSIBLE_CATEGORY_NAME___");
                }
                a aVar = (a) this.f24706d.m27768k().m12669f();
                int i8 = aVar == null ? -1 : b.f24710a[aVar.ordinal()];
                if (i8 == 1) {
                    String str3 = (String) this.f24706d.m27770n().m12669f();
                    if (str3 == null) {
                        C1435m c1435m2 = (C1435m) this.f24706d.m27769l().m12669f();
                        String str4 = this.f24705c;
                        if ((str4 == null || str4.length() == 0) && c1435m2 == null) {
                            listJ = AbstractC1638q.m6765j();
                        } else if (c1435m2 != null) {
                            String str5 = this.f24705c;
                            listJ = (str5 == null || str5.length() == 0) ? interfaceC2983eMo15146G.mo14875p(((Number) c1435m2.m6070c()).longValue(), ((Number) c1435m2.m6071d()).longValue(), listJ0) : interfaceC2983eMo15146G.mo14877r(str2, ((Number) c1435m2.m6070c()).longValue(), ((Number) c1435m2.m6071d()).longValue(), listJ0);
                        } else {
                            listJ = interfaceC2983eMo15146G.mo14862c(str2, listJ0);
                        }
                    } else {
                        Iterator it2 = this.f24706d.m27767j().iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (!AbstractC6118n.m27183a(((C5209a) next).m24098d(), str3));
                        C5209a c5209a2 = (C5209a) next;
                        if (c5209a2 == null || !c5209a2.m24102h() || this.f24706d.m27773r().contains(str3)) {
                            C1435m c1435m3 = (C1435m) this.f24706d.m27769l().m12669f();
                            String str6 = this.f24705c;
                            if ((str6 == null || str6.length() == 0) && c1435m3 == null) {
                                listJ = AbstractC1638q.m6765j();
                            } else if (c1435m3 != null) {
                                String str7 = this.f24705c;
                                listJ = (str7 == null || str7.length() == 0) ? interfaceC2983eMo15146G.mo14863d(str3, ((Number) c1435m3.m6070c()).longValue(), ((Number) c1435m3.m6071d()).longValue()) : interfaceC2983eMo15146G.mo14867h(str2, str3, ((Number) c1435m3.m6070c()).longValue(), ((Number) c1435m3.m6071d()).longValue());
                            } else {
                                listJ = interfaceC2983eMo15146G.mo14881v(str2, str3);
                            }
                        } else {
                            listJ = AbstractC1638q.m6765j();
                        }
                    }
                } else if (i8 == 2) {
                    long jM27761q = this.f24706d.m27761q();
                    String str8 = this.f24705c;
                    listJ = (str8 == null || str8.length() == 0) ? interfaceC2983eMo15146G.mo14876q(jM27761q) : interfaceC2983eMo15146G.mo14884y(str2, jM27761q);
                } else if (i8 == 3) {
                    long jM27762s = this.f24706d.m27762s();
                    String str9 = this.f24705c;
                    listJ = (str9 == null || str9.length() == 0) ? interfaceC2983eMo15146G.mo14864e(jM27762s) : interfaceC2983eMo15146G.mo14872m(str2, jM27762s);
                } else if (i8 == 4) {
                    long jM27760m = this.f24706d.m27760m();
                    String str10 = this.f24705c;
                    listJ = (str10 == null || str10.length() == 0) ? interfaceC2983eMo15146G.mo14879t(jM27760m) : interfaceC2983eMo15146G.mo14869j(str2, jM27760m);
                } else if (i8 == 5 && (c1435m = (C1435m) this.f24706d.m27769l().m12669f()) != null) {
                    String str11 = this.f24705c;
                    long jLongValue = ((Number) c1435m.m6068a()).longValue();
                    long jLongValue2 = ((Number) c1435m.m6069b()).longValue();
                    listJ = (str11 == null || str11.length() == 0) ? interfaceC2983eMo15146G.mo14880u(jLongValue, jLongValue2) : interfaceC2983eMo15146G.mo14874o(str2, jLongValue, jLongValue2);
                    if (listJ == null) {
                        listJ = AbstractC1638q.m6765j();
                    }
                } else {
                    listJ = AbstractC1638q.m6765j();
                }
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar2 = new a(this.f24706d, listJ, null);
                this.f24703a = 1;
                if (AbstractC6668i.m28186g(abstractC6615I0M28164c, aVar2, this) == objE) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final long m27760m() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final long m27761q() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final long m27762s() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(7, 2);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: renamed from: A */
    public final void m27763A(List list) {
        AbstractC6118n.m27187e(list, "<set-?>");
        this.f24673c = list;
    }

    /* JADX INFO: renamed from: B */
    public final void m27764B(String categoryName) {
        AbstractC6118n.m27187e(categoryName, "categoryName");
        this.f24678h.add(categoryName);
    }

    /* JADX INFO: renamed from: h */
    public final void m27765h() {
        this.f24678h.clear();
    }

    /* JADX INFO: renamed from: i */
    public final C2611C m27766i() {
        return this.f24672b;
    }

    /* JADX INFO: renamed from: j */
    public final List m27767j() {
        return this.f24679i;
    }

    /* JADX INFO: renamed from: k */
    public final C2611C m27768k() {
        return this.f24675e;
    }

    /* JADX INFO: renamed from: l */
    public final C2611C m27769l() {
        return this.f24676f;
    }

    /* JADX INFO: renamed from: n */
    public final C2611C m27770n() {
        return this.f24677g;
    }

    /* JADX INFO: renamed from: o */
    public final C2611C m27771o() {
        return this.f24674d;
    }

    /* JADX INFO: renamed from: p */
    public final List m27772p() {
        List list = this.f24673c;
        if (list != null) {
            return list;
        }
        AbstractC6118n.m27197o("textsMutableMap");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final Set m27773r() {
        return this.f24678h;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m27774t(String categoryName) {
        AbstractC6118n.m27187e(categoryName, "categoryName");
        return this.f24678h.contains(categoryName);
    }

    /* JADX INFO: renamed from: u */
    public final void m27775u(Context context) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6672k.m28227d(AbstractC2633Z.m12590a(this), C6656c0.m28163b(), null, new b(context, this, null), 2, null);
    }

    /* JADX INFO: renamed from: v */
    public final void m27776v(Context context, String str, int i7) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6672k.m28227d(AbstractC2633Z.m12590a(this), C6656c0.m28163b(), null, new c(context, str, this, i7, null), 2, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m27777w(Context context, String str) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6672k.m28227d(AbstractC2633Z.m12590a(this), C6656c0.m28163b(), null, new d(context, str, this, null), 2, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m27778x(List list) {
        AbstractC6118n.m27187e(list, "<set-?>");
        this.f24679i = list;
    }

    /* JADX INFO: renamed from: y */
    public final void m27779y(C1435m c1435m) {
        this.f24676f.mo12526q(c1435m);
    }

    /* JADX INFO: renamed from: z */
    public final void m27780z(String str) {
        this.f24677g.mo12526q(str);
        this.f24675e.mo12526q(a.BY_CATEGORY);
    }
}
