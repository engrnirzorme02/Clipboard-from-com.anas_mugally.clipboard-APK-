package p371v1;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.database.AppDatabase;
import com.anas_mugally.clipboard.p221ui.p222ai.AiTextProcessingActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p225d1.C5209a;
import p225d1.C5211c;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6615I0;
import p318o6.AbstractC6626O;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.InterfaceC6624N;

/* JADX INFO: renamed from: v1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C7213n {

    /* JADX INFO: renamed from: a */
    private final Context f28763a;

    /* JADX INFO: renamed from: b */
    private final AppDatabase f28764b;

    /* JADX INFO: renamed from: c */
    private List f28765c;

    /* JADX INFO: renamed from: d */
    private final C7210k f28766d;

    /* JADX INFO: renamed from: v1.n$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo15502a(String str);

        /* JADX INFO: renamed from: b */
        void mo15503b(String str);
    }

    /* JADX INFO: renamed from: v1.n$b */
    static final class b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f28767a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f28768b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C7213n f28769c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C5209a f28770d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ a f28771e;

        /* JADX INFO: renamed from: v1.n$b$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f28772a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ a f28773b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C5209a f28774c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a aVar, C5209a c5209a, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f28773b = aVar;
                this.f28774c = c5209a;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f28773b, this.f28774c, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f28772a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                a aVar = this.f28773b;
                String strM24099e = this.f28774c.m24099e();
                AbstractC6118n.m27184b(strM24099e);
                aVar.mo15503b(strM24099e);
                return C1444v.f4971a;
            }
        }

        /* JADX INFO: renamed from: v1.n$b$b, reason: collision with other inner class name */
        static final class C7729b extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f28775a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ a f28776b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ Exception f28777c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7729b(a aVar, Exception exc, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f28776b = aVar;
                this.f28777c = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new C7729b(this.f28776b, this.f28777c, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((C7729b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f28775a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                this.f28776b.mo15502a("Failed to save text: " + this.f28777c.getMessage());
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, C7213n c7213n, C5209a c5209a, a aVar, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f28768b = str;
            this.f28769c = c7213n;
            this.f28770d = c5209a;
            this.f28771e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return new b(this.f28768b, this.f28769c, this.f28770d, this.f28771e, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
        
            if (p318o6.AbstractC6668i.m28186g(r0, r6, r18) == r2) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
        
            if (p318o6.AbstractC6668i.m28186g(r5, r6, r18) == r2) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
        
            return r2;
         */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f28767a;
            try {
                if (i7 == 0) {
                    AbstractC1437o.m6082b(obj);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String string = DateFormat.format("MMM d, y hh:mm a", jCurrentTimeMillis).toString();
                    if (!AbstractC3041D.m15087l(this.f28768b)) {
                        return C1444v.f4971a;
                    }
                    this.f28769c.f28764b.mo15146G().mo14878s(new C5211c(0, jCurrentTimeMillis, string, this.f28768b, this.f28770d.m24098d(), 0L, false, 97, null));
                    AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                    a aVar = new a(this.f28771e, this.f28770d, null);
                    this.f28767a = 1;
                } else {
                    if (i7 != 1 && i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
            } catch (Exception e7) {
                AbstractC6615I0 abstractC6615I0M28164c2 = C6656c0.m28164c();
                C7729b c7729b = new C7729b(this.f28771e, e7, null);
                this.f28767a = 2;
            }
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: v1.n$c */
    static final class c extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f28778a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ a f28780c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f28781d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ View f28782e;

        /* JADX INFO: renamed from: v1.n$c$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f28783a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C7213n f28784b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ a f28785c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ String f28786d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ View f28787e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C7213n c7213n, a aVar, String str, View view, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f28784b = c7213n;
                this.f28785c = aVar;
                this.f28786d = str;
                this.f28787e = view;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: k */
            public static final C1444v m31856k(C7213n c7213n, C5209a c5209a, String str, a aVar) {
                c7213n.m31846i(c5209a, str, aVar);
                return C1444v.f4971a;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f28784b, this.f28785c, this.f28786d, this.f28787e, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f28783a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                List list = this.f28784b.f28765c;
                List list2 = null;
                if (list == null) {
                    AbstractC6118n.m27197o("categories");
                    list = null;
                }
                if (list.isEmpty()) {
                    this.f28785c.mo15502a("Categories list is empty or null");
                    return C1444v.f4971a;
                }
                List list3 = this.f28784b.f28765c;
                if (list3 == null) {
                    AbstractC6118n.m27197o("categories");
                    list3 = null;
                }
                if (list3.size() == 1) {
                    C7213n c7213n = this.f28784b;
                    List list4 = c7213n.f28765c;
                    if (list4 == null) {
                        AbstractC6118n.m27197o("categories");
                    } else {
                        list2 = list4;
                    }
                    c7213n.m31846i((C5209a) list2.get(0), this.f28786d, this.f28785c);
                    return C1444v.f4971a;
                }
                List<C5209a> list5 = this.f28784b.f28765c;
                if (list5 == null) {
                    AbstractC6118n.m27197o("categories");
                    list5 = null;
                }
                final C7213n c7213n2 = this.f28784b;
                final String str = this.f28786d;
                final a aVar = this.f28785c;
                ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(list5, 10));
                for (final C5209a c5209a : list5) {
                    String strM24099e = c5209a.m24099e();
                    if (strM24099e == null) {
                        strM24099e = "";
                    }
                    arrayList.add(new C7210k.d(strM24099e, c5209a.m24102h() ? new C7210k.b(c7213n2.f28763a.getDrawable(R.drawable.ic_locked), false, 2, null) : null, new InterfaceC5356a() { // from class: v1.o
                        @Override // p238e6.InterfaceC5356a
                        public final Object invoke() {
                            return C7213n.c.a.m31856k(c7213n2, c5209a, str, aVar);
                        }
                    }, null, null, 24, null));
                }
                C7210k.m31796O(this.f28784b.f28766d, this.f28787e, arrayList, null, null, this.f28784b.f28763a instanceof AiTextProcessingActivity, 12, null);
                return C1444v.f4971a;
            }
        }

        /* JADX INFO: renamed from: v1.n$c$b */
        static final class b extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f28788a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ a f28789b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ Exception f28790c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(a aVar, Exception exc, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f28789b = aVar;
                this.f28790c = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new b(this.f28789b, this.f28790c, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f28788a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                this.f28789b.mo15502a("Error loading categories: " + this.f28790c.getMessage());
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a aVar, String str, View view, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f28780c = aVar;
            this.f28781d = str;
            this.f28782e = view;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C7213n.this.new c(this.f28780c, this.f28781d, this.f28782e, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((c) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
        
            if (p318o6.AbstractC6668i.m28186g(r11, r4, r10) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
        
            if (p318o6.AbstractC6668i.m28186g(r0, r3, r10) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        
            return r1;
         */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f28778a;
            try {
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1437o.m6082b(obj);
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1437o.m6082b(obj);
                    }
                    return C1444v.f4971a;
                }
                AbstractC1437o.m6082b(obj);
                C7213n c7213n = C7213n.this;
                c7213n.f28765c = c7213n.f28764b.mo15144E().mo14845e();
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar = new a(C7213n.this, this.f28780c, this.f28781d, this.f28782e, null);
                this.f28778a = 1;
            } catch (Exception e7) {
                AbstractC6615I0 abstractC6615I0M28164c2 = C6656c0.m28164c();
                b bVar = new b(this.f28780c, e7, null);
                this.f28778a = 2;
            }
            return C1444v.f4971a;
        }
    }

    public C7213n(Context context, AppDatabase database) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(database, "database");
        this.f28763a = context;
        this.f28764b = database;
        this.f28766d = new C7210k(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final void m31846i(C5209a c5209a, String str, a aVar) {
        AbstractC6672k.m28227d(AbstractC6626O.m28098a(C6656c0.m28163b()), null, null, new b(str, this, c5209a, aVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C1444v m31847k(InterfaceC5367l interfaceC5367l, C5209a c5209a) {
        String strM24098d = c5209a.m24098d();
        if (strM24098d == null) {
            strM24098d = "";
        }
        interfaceC5367l.invoke(strM24098d);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C1444v m31848l(InterfaceC5356a interfaceC5356a) {
        interfaceC5356a.invoke();
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: j */
    public final void m31849j(View anchor, List list, final InterfaceC5367l onCategorySelected, final InterfaceC5356a onAddNewCategory) {
        AbstractC6118n.m27187e(anchor, "anchor");
        AbstractC6118n.m27187e(onCategorySelected, "onCategorySelected");
        AbstractC6118n.m27187e(onAddNewCategory, "onAddNewCategory");
        if (list == null || list.isEmpty()) {
            onAddNewCategory.invoke();
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final C5209a c5209a = (C5209a) it.next();
                String strM24099e = c5209a.m24099e();
                if (strM24099e == null) {
                    strM24099e = "";
                }
                arrayList.add(new C7210k.d(strM24099e, c5209a.m24102h() ? new C7210k.b(this.f28763a.getDrawable(R.drawable.ic_locked), false, 2, null) : null, new InterfaceC5356a() { // from class: v1.l
                    @Override // p238e6.InterfaceC5356a
                    public final Object invoke() {
                        return C7213n.m31847k(onCategorySelected, c5209a);
                    }
                }, null, null, 24, null));
            }
            String string = this.f28763a.getString(R.string.add_new_section);
            AbstractC6118n.m27186d(string, "getString(...)");
            arrayList.add(new C7210k.d(string, new C7210k.b(this.f28763a.getDrawable(R.drawable.ic_add), false, 2, null), new InterfaceC5356a() { // from class: v1.m
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return C7213n.m31848l(onAddNewCategory);
                }
            }, null, null, 24, null));
            C7210k.m31796O(this.f28766d, anchor, arrayList, null, arrayList.size() > 1 ? AbstractC1638q.m6759d(Integer.valueOf(arrayList.size() - 1)) : AbstractC1638q.m6765j(), false, 20, null);
        } catch (Exception unused) {
            onAddNewCategory.invoke();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m31850m(View anchor, String text, a callback) {
        AbstractC6118n.m27187e(anchor, "anchor");
        AbstractC6118n.m27187e(text, "text");
        AbstractC6118n.m27187e(callback, "callback");
        if (AbstractC3041D.m15081f(this.f28763a, text)) {
            AbstractC6672k.m28227d(AbstractC6626O.m28098a(C6656c0.m28163b()), null, null, new c(callback, text, anchor, null), 3, null);
        }
    }
}
