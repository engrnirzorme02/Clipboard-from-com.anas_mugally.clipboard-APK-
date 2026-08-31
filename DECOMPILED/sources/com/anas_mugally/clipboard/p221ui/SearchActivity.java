package com.anas_mugally.clipboard.p221ui;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.databinding.AbstractC2473f;
import androidx.lifecycle.C2635a0;
import androidx.lifecycle.InterfaceC2612D;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.database.AppDatabase;
import com.anas_mugally.clipboard.p221ui.SearchActivity;
import com.anas_mugally.clipboard.p221ui.addText.AddNoteActivity;
import com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a;
import com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity;
import com.anas_mugally.clipboard.p221ui.notes.AbstractViewOnClickListenerC3141a;
import com.google.android.material.chip.Chip;
import com.google.android.material.datepicker.C4486r;
import com.google.android.material.datepicker.InterfaceC4487s;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.InterfaceC6113i;
import p104N.C0906c;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1437o;
import p145S5.C1435m;
import p145S5.C1444v;
import p145S5.InterfaceC1425c;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1617O;
import p152T5.AbstractC1631j;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p189Z0.C2082r;
import p215c1.InterfaceC2983e;
import p223d.AbstractC5158A;
import p223d.AbstractC5166I;
import p225d1.C5209a;
import p225d1.C5211c;
import p233e1.AbstractC5319s;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p238e6.InterfaceC5373r;
import p241f1.C5411i;
import p281k1.C5920K;
import p313o1.C6540v;
import p318o6.AbstractC6615I0;
import p318o6.AbstractC6645Y;
import p318o6.AbstractC6668i;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.C6689s0;
import p318o6.InterfaceC6624N;
import p318o6.InterfaceC6701y0;
import p371v1.C7213n;
import p379w1.AbstractC7305Z;

/* JADX INFO: loaded from: classes.dex */
public final class SearchActivity extends BaseMyAppAdsActivity implements View.OnClickListener, InterfaceC5373r {

    /* JADX INFO: renamed from: M0 */
    private AbstractC5319s f12750M0;

    /* JADX INFO: renamed from: N0 */
    private C6540v f12751N0;

    /* JADX INFO: renamed from: O0 */
    private C2082r f12752O0;

    /* JADX INFO: renamed from: P0 */
    private InterfaceC6701y0 f12753P0;

    /* JADX INFO: renamed from: R0 */
    private List f12755R0;

    /* JADX INFO: renamed from: L0 */
    private final InterfaceC1429g f12749L0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.e0
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return SearchActivity.m15439O4(this.f24016a);
        }
    });

    /* JADX INFO: renamed from: Q0 */
    private List f12754Q0 = AbstractC1638q.m6765j();

    /* JADX INFO: renamed from: S0 */
    private final C3092f f12756S0 = new C3092f();

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.SearchActivity$a */
    static final class C3087a extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12757a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ List f12759c;

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.SearchActivity$a$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f12760a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ SearchActivity f12761b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ List f12762c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SearchActivity searchActivity, List list, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f12761b = searchActivity;
                this.f12762c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f12761b, this.f12762c, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f12760a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                C2082r c2082r = this.f12761b.f12752O0;
                AbstractC6118n.m27184b(c2082r);
                List listM15495R4 = this.f12761b.m15495R4();
                if (listM15495R4 == null) {
                    listM15495R4 = AbstractC1638q.m6765j();
                }
                c2082r.m8546K(listM15495R4);
                this.f12761b.m15491y5(this.f12762c);
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3087a(List list, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f12759c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return SearchActivity.this.new C3087a(this.f12759c, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((C3087a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f12757a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                SearchActivity.this.f12755R0 = this.f12759c;
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar = new a(SearchActivity.this, this.f12759c, null);
                this.f12757a = 1;
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

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.SearchActivity$b */
    static final class C3088b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12763a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Integer[] f12765c;

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.SearchActivity$b$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f12766a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ SearchActivity f12767b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SearchActivity searchActivity, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f12767b = searchActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f12767b, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f12766a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                this.f12767b.m15460i5();
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3088b(Integer[] numArr, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f12765c = numArr;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return SearchActivity.this.new C3088b(this.f12765c, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((C3088b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f12763a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                InterfaceC2983e interfaceC2983eMo15146G = AppDatabase.f12597p.m15148b(SearchActivity.this).mo15146G();
                List listM15495R4 = SearchActivity.this.m15495R4();
                AbstractC6118n.m27184b(listM15495R4);
                interfaceC2983eMo15146G.mo14861b((C5211c) listM15495R4.get(((Number) AbstractC1631j.m6747t(this.f12765c)).intValue()));
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar = new a(SearchActivity.this, null);
                this.f12763a = 1;
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

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.SearchActivity$c */
    public static final class C3089c implements C7213n.a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f12769b;

        C3089c(int i7) {
            this.f12769b = i7;
        }

        @Override // p371v1.C7213n.a
        /* JADX INFO: renamed from: a */
        public void mo15502a(String error) {
            AbstractC6118n.m27187e(error, "error");
            Toast.makeText(SearchActivity.this, error, 0).show();
        }

        @Override // p371v1.C7213n.a
        /* JADX INFO: renamed from: b */
        public void mo15503b(String categoryName) {
            AbstractC6118n.m27187e(categoryName, "categoryName");
            SearchActivity.this.m15440P4(new Integer[]{Integer.valueOf(this.f12769b)});
            SearchActivity searchActivity = SearchActivity.this;
            Toast.makeText(searchActivity, searchActivity.getString(R.string.done_add_to_clipboard, categoryName), 0).show();
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.SearchActivity$d */
    static final class C3090d extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12770a;

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.SearchActivity$d$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f12772a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ SearchActivity f12773b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SearchActivity searchActivity, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f12773b = searchActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f12773b, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f12772a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                C6540v c6540v = this.f12773b.f12751N0;
                if (c6540v == null) {
                    AbstractC6118n.m27197o("viewModel");
                    c6540v = null;
                }
                c6540v.m27778x(this.f12773b.f12754Q0);
                this.f12773b.m15463k5();
                return C1444v.f4971a;
            }
        }

        C3090d(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return SearchActivity.this.new C3090d(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((C3090d) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f12770a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                SearchActivity searchActivity = SearchActivity.this;
                searchActivity.f12754Q0 = searchActivity.m15442S4().mo15144E().mo14845e();
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar = new a(SearchActivity.this, null);
                this.f12770a = 1;
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

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.SearchActivity$e */
    static final class C3091e implements InterfaceC2612D, InterfaceC6113i {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ InterfaceC5367l f12774a;

        C3091e(InterfaceC5367l function) {
            AbstractC6118n.m27187e(function, "function");
            this.f12774a = function;
        }

        @Override // kotlin.jvm.internal.InterfaceC6113i
        /* JADX INFO: renamed from: a */
        public final InterfaceC1425c mo12586a() {
            return this.f12774a;
        }

        @Override // androidx.lifecycle.InterfaceC2612D
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void mo12097b(Object obj) {
            this.f12774a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC2612D) && (obj instanceof InterfaceC6113i)) {
                return AbstractC6118n.m27183a(mo12586a(), ((InterfaceC6113i) obj).mo12586a());
            }
            return false;
        }

        public final int hashCode() {
            return mo12586a().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.SearchActivity$f */
    public static final class C3092f implements TextWatcher {

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.SearchActivity$f$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f12776a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ SearchActivity f12777b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SearchActivity searchActivity, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f12777b = searchActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f12777b, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                Object objE = AbstractC2005b.m8369e();
                int i7 = this.f12776a;
                if (i7 == 0) {
                    AbstractC1437o.m6082b(obj);
                    this.f12776a = 1;
                    if (AbstractC6645Y.m28137a(300L, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
                this.f12777b.m15460i5();
                return C1444v.f4971a;
            }
        }

        C3092f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            InterfaceC6701y0 interfaceC6701y0 = SearchActivity.this.f12753P0;
            if (interfaceC6701y0 != null) {
                InterfaceC6701y0.a.m28291b(interfaceC6701y0, null, 1, null);
            }
            AbstractC5319s abstractC5319s = SearchActivity.this.f12750M0;
            if (abstractC5319s == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5319s = null;
            }
            abstractC5319s.f20356H.setVisibility(0);
            SearchActivity.this.f12753P0 = AbstractC6672k.m28227d(C6689s0.f24991a, C6656c0.m28164c(), null, new a(SearchActivity.this, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: A5 */
    private final void m15425A5(String str) {
        Object next;
        AbstractC5319s abstractC5319s = this.f12750M0;
        C6540v c6540v = null;
        if (abstractC5319s == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5319s = null;
        }
        if (str == null) {
            m15441Q4();
            return;
        }
        Iterator it = this.f12754Q0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC6118n.m27183a(((C5209a) next).m24098d(), str));
        C5209a c5209a = (C5209a) next;
        if (c5209a != null && c5209a.m24102h()) {
            C6540v c6540v2 = this.f12751N0;
            if (c6540v2 == null) {
                AbstractC6118n.m27197o("viewModel");
            } else {
                c6540v = c6540v2;
            }
            if (!c6540v.m27774t(str)) {
                abstractC5319s.f20358J.setEnabled(false);
                abstractC5319s.f20353E.setEnabled(false);
                abstractC5319s.f20358J.setStartIconDrawable(R.drawable.ic_locked_tab);
                abstractC5319s.f20358J.setHint(getString(R.string.category_locked_title));
                m15475q5(c5209a);
                return;
            }
        }
        m15441Q4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O4 */
    public static final AppDatabase m15439O4(SearchActivity searchActivity) {
        return AppDatabase.f12597p.m15148b(searchActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public final void m15440P4(Integer[] numArr) {
        setResult(-1);
        AbstractC6672k.m28227d(C6689s0.f24991a, null, null, new C3088b(numArr, null), 3, null);
    }

    /* JADX INFO: renamed from: Q4 */
    private final void m15441Q4() {
        AbstractC5319s abstractC5319s = this.f12750M0;
        AbstractC5319s abstractC5319s2 = null;
        if (abstractC5319s == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5319s = null;
        }
        abstractC5319s.f20358J.setEnabled(true);
        AbstractC5319s abstractC5319s3 = this.f12750M0;
        if (abstractC5319s3 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5319s3 = null;
        }
        abstractC5319s3.f20353E.setEnabled(true);
        AbstractC5319s abstractC5319s4 = this.f12750M0;
        if (abstractC5319s4 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5319s4 = null;
        }
        abstractC5319s4.f20358J.setStartIconDrawable(R.drawable.ic_search);
        AbstractC5319s abstractC5319s5 = this.f12750M0;
        if (abstractC5319s5 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5319s2 = abstractC5319s5;
        }
        abstractC5319s2.f20358J.setHint(getString(R.string.search_hint));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public final AppDatabase m15442S4() {
        return (AppDatabase) this.f12749L0.getValue();
    }

    /* JADX INFO: renamed from: T4 */
    private final void m15443T4(View view, String str, int i7) {
        AppDatabase appDatabaseM15442S4 = m15442S4();
        AbstractC6118n.m27184b(appDatabaseM15442S4);
        C7213n c7213n = new C7213n(this, appDatabaseM15442S4);
        AbstractC6118n.m27184b(view);
        AbstractC6118n.m27184b(str);
        c7213n.m31850m(view, str, new C3089c(i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V4 */
    public static final C1444v m15444V4(SearchActivity searchActivity, View view, int i7, int i8, String str) {
        searchActivity.m15445W4(view, i7, i8, str);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: W4 */
    private final void m15445W4(View view, final int i7, int i8, String str) {
        C5211c c5211c;
        String strM24112f;
        List list = this.f12755R0;
        if (list == null || i7 > list.size()) {
            return;
        }
        List list2 = this.f12755R0;
        AbstractC6118n.m27184b(list2);
        C5211c c5211c2 = (C5211c) AbstractC1638q.m6573M(list2, i7);
        if (c5211c2 != null && (strM24112f = c5211c2.m24112f()) != null) {
            str = strM24112f;
        } else if (str == null) {
            str = "";
        }
        if (AbstractC3041D.m15081f(this, str)) {
            if (i8 == R.id.delete) {
                C3034A.f12453a.m15023J(this, 1, new InterfaceC5356a() { // from class: l1.q0
                    @Override // p238e6.InterfaceC5356a
                    public final Object invoke() {
                        return SearchActivity.m15446X4(this.f24059a, i7);
                    }
                });
                return;
            }
            if (i8 != R.id.edit) {
                if (i8 == R.id.swap) {
                    m15443T4(view, str, i7);
                    return;
                }
                C5920K c5920k = new C5920K(this, str, false);
                AbstractC6118n.m27184b(view);
                c5920k.m26717s(view, m15442S4());
                c5920k.m26716i(i8);
                return;
            }
            AbstractC6118n.m27184b(view);
            view.setTransitionName("edit_shared_element_transition");
            ActivityOptions activityOptionsMakeSceneTransitionAnimation = ActivityOptions.makeSceneTransitionAnimation(this, view, "edit_shared_element_transition");
            Intent intent = new Intent(this, (Class<?>) AddNoteActivity.class);
            AbstractViewOnClickListenerC3141a.a aVar = AbstractViewOnClickListenerC3141a.f13140d1;
            String strM16595b = aVar.m16595b();
            List list3 = this.f12755R0;
            if (list3 == null || (c5211c = (C5211c) AbstractC1638q.m6573M(list3, i7)) == null) {
                return;
            }
            startActivity(intent.putExtra(strM16595b, c5211c).putExtra(aVar.m16596c(), true), activityOptionsMakeSceneTransitionAnimation.toBundle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public static final C1444v m15446X4(SearchActivity searchActivity, int i7) {
        searchActivity.m15440P4(new Integer[]{Integer.valueOf(i7)});
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: Y4 */
    private final void m15447Y4() {
        AbstractC6672k.m28227d(C6689s0.f24991a, C6656c0.m28163b(), null, new C3090d(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public static final C1444v m15448Z4(SearchActivity searchActivity, C1435m c1435m) {
        searchActivity.m15483u5(c1435m);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public static final C1444v m15449a5(SearchActivity searchActivity, List list) {
        searchActivity.m15497j5(list);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b5 */
    public static final C1444v m15450b5(SearchActivity searchActivity, C6540v.a aVar) {
        AbstractC6118n.m27184b(aVar);
        searchActivity.m15493z5(aVar);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c5 */
    public static final C1444v m15451c5(SearchActivity searchActivity, String str) {
        searchActivity.m15481t5();
        searchActivity.m15425A5(str);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX INFO: renamed from: d5 */
    public static final C1444v m15452d5(SearchActivity searchActivity, AbstractC5158A addCallback) {
        AbstractC6118n.m27187e(addCallback, "$this$addCallback");
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC5319s abstractC5319s = searchActivity.f12750M0;
            AbstractC5319s abstractC5319s2 = null;
            if (abstractC5319s == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5319s = null;
            }
            if (abstractC5319s.f20353E.isFocused()) {
                AbstractC5319s abstractC5319s3 = searchActivity.f12750M0;
                if (abstractC5319s3 == null) {
                    AbstractC6118n.m27197o("binding");
                } else {
                    abstractC5319s2 = abstractC5319s3;
                }
                abstractC5319s2.f20353E.clearFocus();
            } else {
                addCallback.m23915j(false);
                searchActivity.finishAndRemoveTask();
            }
        } else {
            addCallback.m23915j(false);
            searchActivity.finishAndRemoveTask();
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e5 */
    public static final void m15453e5(AbstractC5319s abstractC5319s, SearchActivity searchActivity) {
        abstractC5319s.f20353E.requestFocus();
        abstractC5319s.f20353E.addTextChangedListener(searchActivity.f12756S0);
        Object systemService = searchActivity.getSystemService("input_method");
        AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(abstractC5319s.f20353E, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f5 */
    public static final void m15454f5(SearchActivity searchActivity, View view) {
        AbstractC7305Z.m32303a(searchActivity);
        searchActivity.finishAndRemoveTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g5 */
    public static final void m15456g5(SearchActivity searchActivity, View view) {
        searchActivity.m15469n5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h5 */
    public static final void m15458h5(SearchActivity searchActivity, View view) {
        Object next;
        C6540v c6540v = searchActivity.f12751N0;
        C6540v c6540v2 = null;
        if (c6540v == null) {
            AbstractC6118n.m27197o("viewModel");
            c6540v = null;
        }
        String str = (String) c6540v.m27770n().m12669f();
        if (str != null) {
            Iterator it = searchActivity.f12754Q0.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC6118n.m27183a(((C5209a) next).m24098d(), str));
            C5209a c5209a = (C5209a) next;
            if (c5209a == null || !c5209a.m24102h()) {
                return;
            }
            C6540v c6540v3 = searchActivity.f12751N0;
            if (c6540v3 == null) {
                AbstractC6118n.m27197o("viewModel");
            } else {
                c6540v2 = c6540v3;
            }
            if (c6540v2.m27774t(str)) {
                return;
            }
            searchActivity.m15475q5(c5209a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i5 */
    public final void m15460i5() {
        AbstractC5319s abstractC5319s = this.f12750M0;
        C6540v c6540v = null;
        if (abstractC5319s == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5319s = null;
        }
        Editable text = abstractC5319s.f20353E.getText();
        String string = text != null ? text.toString() : null;
        C6540v c6540v2 = this.f12751N0;
        if (c6540v2 == null) {
            AbstractC6118n.m27197o("viewModel");
        } else {
            c6540v = c6540v2;
        }
        c6540v.m27777w(this, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k5 */
    public final void m15463k5() {
        AbstractC5319s abstractC5319s = this.f12750M0;
        if (abstractC5319s == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5319s = null;
        }
        abstractC5319s.f20350B.removeAllViews();
        View viewInflate = getLayoutInflater().inflate(R.layout.chip, (ViewGroup) null);
        AbstractC6118n.m27185c(viewInflate, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
        Chip chip = (Chip) viewInflate;
        chip.setId(View.generateViewId());
        chip.setText(getString(R.string.filter_all));
        chip.setCheckable(true);
        C6540v c6540v = this.f12751N0;
        if (c6540v == null) {
            AbstractC6118n.m27197o("viewModel");
            c6540v = null;
        }
        chip.setChecked(c6540v.m27770n().m12669f() == null);
        chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l1.j0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                SearchActivity.m15465l5(this.f24032a, compoundButton, z7);
            }
        });
        AbstractC5319s abstractC5319s2 = this.f12750M0;
        if (abstractC5319s2 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5319s2 = null;
        }
        abstractC5319s2.f20350B.addView(chip);
        for (final C5209a c5209a : this.f12754Q0) {
            View viewInflate2 = getLayoutInflater().inflate(R.layout.chip, (ViewGroup) null);
            AbstractC6118n.m27185c(viewInflate2, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
            Chip chip2 = (Chip) viewInflate2;
            chip2.setId(View.generateViewId());
            String strM24099e = c5209a.m24099e();
            if (strM24099e == null) {
                strM24099e = c5209a.m24098d();
            }
            chip2.setText(strM24099e);
            chip2.setCheckable(true);
            C6540v c6540v2 = this.f12751N0;
            if (c6540v2 == null) {
                AbstractC6118n.m27197o("viewModel");
                c6540v2 = null;
            }
            chip2.setChecked(AbstractC6118n.m27183a(c6540v2.m27770n().m12669f(), c5209a.m24098d()));
            if (c5209a.m24102h()) {
                chip2.setChipIconResource(R.drawable.ic_locked_tab);
            }
            chip2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l1.k0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                    SearchActivity.m15467m5(this.f24036a, c5209a, compoundButton, z7);
                }
            });
            AbstractC5319s abstractC5319s3 = this.f12750M0;
            if (abstractC5319s3 == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5319s3 = null;
            }
            abstractC5319s3.f20350B.addView(chip2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l5 */
    public static final void m15465l5(SearchActivity searchActivity, CompoundButton compoundButton, boolean z7) {
        AbstractC6118n.m27187e(compoundButton, "<unused var>");
        if (z7) {
            C6540v c6540v = searchActivity.f12751N0;
            if (c6540v == null) {
                AbstractC6118n.m27197o("viewModel");
                c6540v = null;
            }
            c6540v.m27780z(null);
            searchActivity.m15460i5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m5 */
    public static final void m15467m5(SearchActivity searchActivity, C5209a c5209a, CompoundButton compoundButton, boolean z7) {
        AbstractC6118n.m27187e(compoundButton, "<unused var>");
        if (z7) {
            C6540v c6540v = searchActivity.f12751N0;
            if (c6540v == null) {
                AbstractC6118n.m27197o("viewModel");
                c6540v = null;
            }
            c6540v.m27780z(c5209a.m24098d());
            searchActivity.m15460i5();
        }
    }

    /* JADX INFO: renamed from: n5 */
    private final void m15469n5() {
        C4486r c4486rM20369a = C4486r.c.m20367c().m20371f(getString(R.string.select_date_range)).m20370e(new C0906c(Long.valueOf(C4486r.m20339D2()), Long.valueOf(C4486r.m20340E2()))).m20369a();
        AbstractC6118n.m27186d(c4486rM20369a, "build(...)");
        final InterfaceC5367l interfaceC5367l = new InterfaceC5367l() { // from class: l1.h0
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return SearchActivity.m15471o5(this.f24026a, (C0906c) obj);
            }
        };
        c4486rM20369a.m20360k2(new InterfaceC4487s() { // from class: l1.i0
            @Override // com.google.android.material.datepicker.InterfaceC4487s
            /* JADX INFO: renamed from: a */
            public final void mo20372a(Object obj) {
                SearchActivity.m15473p5(interfaceC5367l, obj);
            }
        });
        c4486rM20369a.mo7649g2(m12232H0(), "DATE_RANGE_PICKER");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o5 */
    public static final C1444v m15471o5(SearchActivity searchActivity, C0906c c0906c) {
        Long l7;
        Long l8 = (Long) c0906c.f3546a;
        if (l8 != null && (l7 = (Long) c0906c.f3547b) != null) {
            long jLongValue = l7.longValue();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jLongValue);
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 999);
            long timeInMillis = calendar.getTimeInMillis();
            C6540v c6540v = searchActivity.f12751N0;
            if (c6540v == null) {
                AbstractC6118n.m27197o("viewModel");
                c6540v = null;
            }
            c6540v.m27779y(new C1435m(l8, Long.valueOf(timeInMillis)));
            searchActivity.m15460i5();
            return C1444v.f4971a;
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public static final void m15473p5(InterfaceC5367l interfaceC5367l, Object obj) {
        interfaceC5367l.invoke(obj);
    }

    /* JADX INFO: renamed from: q5 */
    private final void m15475q5(final C5209a c5209a) {
        if (m12232H0().m12379h0("AccessByPasswordOrBiometricDialog") == null) {
            C5411i c5411iM24530a = C5411i.f20591L0.m24530a(c5209a.m24097c());
            c5411iM24530a.m24529y2(new InterfaceC5371p() { // from class: l1.p0
                @Override // p238e6.InterfaceC5371p
                public final Object invoke(Object obj, Object obj2) {
                    return SearchActivity.m15477r5(c5209a, this, (String) obj, (C5411i) obj2);
                }
            });
            c5411iM24530a.m24528x2(new InterfaceC5356a() { // from class: l1.r0
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return SearchActivity.m15479s5(this.f24063a, c5209a);
                }
            });
            c5411iM24530a.mo7649g2(m12232H0(), "AccessByPasswordOrBiometricDialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r5 */
    public static final C1444v m15477r5(C5209a c5209a, SearchActivity searchActivity, String pass, C5411i dialog) {
        AbstractC6118n.m27187e(pass, "pass");
        AbstractC6118n.m27187e(dialog, "dialog");
        if (AbstractC6118n.m27183a(pass, c5209a.m24101g())) {
            dialog.mo12082T1();
            C6540v c6540v = searchActivity.f12751N0;
            C6540v c6540v2 = null;
            if (c6540v == null) {
                AbstractC6118n.m27197o("viewModel");
                c6540v = null;
            }
            c6540v.m27764B(c5209a.m24098d());
            C6540v c6540v3 = searchActivity.f12751N0;
            if (c6540v3 == null) {
                AbstractC6118n.m27197o("viewModel");
            } else {
                c6540v2 = c6540v3;
            }
            c6540v2.m27780z(c5209a.m24098d());
            searchActivity.m15460i5();
        } else {
            dialog.m24526B2();
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s5 */
    public static final C1444v m15479s5(SearchActivity searchActivity, C5209a c5209a) {
        C6540v c6540v = searchActivity.f12751N0;
        C6540v c6540v2 = null;
        if (c6540v == null) {
            AbstractC6118n.m27197o("viewModel");
            c6540v = null;
        }
        c6540v.m27764B(c5209a.m24098d());
        C6540v c6540v3 = searchActivity.f12751N0;
        if (c6540v3 == null) {
            AbstractC6118n.m27197o("viewModel");
        } else {
            c6540v2 = c6540v3;
        }
        c6540v2.m27780z(c5209a.m24098d());
        searchActivity.m15460i5();
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: t5 */
    private final void m15481t5() {
        AbstractC5319s abstractC5319s = this.f12750M0;
        if (abstractC5319s == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5319s = null;
        }
        int childCount = abstractC5319s.f20350B.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            AbstractC5319s abstractC5319s2 = this.f12750M0;
            if (abstractC5319s2 == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5319s2 = null;
            }
            View childAt = abstractC5319s2.f20350B.getChildAt(i7);
            Chip chip = childAt instanceof Chip ? (Chip) childAt : null;
            if (i7 != 0) {
                C5209a c5209a = (C5209a) AbstractC1638q.m6573M(this.f12754Q0, i7 - 1);
                if (chip != null) {
                    C6540v c6540v = this.f12751N0;
                    if (c6540v == null) {
                        AbstractC6118n.m27197o("viewModel");
                        c6540v = null;
                    }
                    chip.setChecked(AbstractC6118n.m27183a(c6540v.m27770n().m12669f(), c5209a != null ? c5209a.m24098d() : null));
                }
            } else if (chip != null) {
                C6540v c6540v2 = this.f12751N0;
                if (c6540v2 == null) {
                    AbstractC6118n.m27197o("viewModel");
                    c6540v2 = null;
                }
                chip.setChecked(c6540v2.m27770n().m12669f() == null);
            }
        }
    }

    /* JADX INFO: renamed from: u5 */
    private final void m15483u5(C1435m c1435m) {
        AbstractC5319s abstractC5319s = this.f12750M0;
        if (abstractC5319s == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5319s = null;
        }
        if (c1435m == null) {
            abstractC5319s.f20358J.setEndIconDrawable(R.drawable.ic_calendar);
            abstractC5319s.f20358J.setEndIconOnClickListener(new View.OnClickListener() { // from class: l1.o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchActivity.m15489x5(this.f24052a, view);
                }
            });
            abstractC5319s.f20359K.setVisibility(8);
            abstractC5319s.f20351C.setVisibility(8);
            return;
        }
        abstractC5319s.f20358J.setEndIconDrawable(R.drawable.ic_clear);
        abstractC5319s.f20358J.setEndIconOnClickListener(new View.OnClickListener() { // from class: l1.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchActivity.m15485v5(this.f24045a, view);
            }
        });
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        abstractC5319s.f20359K.setText(getString(R.string.date_range_display, simpleDateFormat.format(new Date(((Number) c1435m.m6070c()).longValue())), simpleDateFormat.format(new Date(((Number) c1435m.m6071d()).longValue()))));
        abstractC5319s.f20359K.setVisibility(0);
        abstractC5319s.f20351C.setVisibility(0);
        abstractC5319s.f20351C.setOnClickListener(new View.OnClickListener() { // from class: l1.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchActivity.m15487w5(this.f24048a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v5 */
    public static final void m15485v5(SearchActivity searchActivity, View view) {
        C6540v c6540v = searchActivity.f12751N0;
        if (c6540v == null) {
            AbstractC6118n.m27197o("viewModel");
            c6540v = null;
        }
        c6540v.m27779y(null);
        searchActivity.m15460i5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w5 */
    public static final void m15487w5(SearchActivity searchActivity, View view) {
        C6540v c6540v = searchActivity.f12751N0;
        if (c6540v == null) {
            AbstractC6118n.m27197o("viewModel");
            c6540v = null;
        }
        c6540v.m27779y(null);
        searchActivity.m15460i5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x5 */
    public static final void m15489x5(SearchActivity searchActivity, View view) {
        searchActivity.m15469n5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y5 */
    public final void m15491y5(List list) {
        Object next;
        AbstractC5319s abstractC5319s = this.f12750M0;
        C6540v c6540v = null;
        if (abstractC5319s == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5319s = null;
        }
        if (list != null && !list.isEmpty()) {
            abstractC5319s.f20354F.setVisibility(8);
            abstractC5319s.f20357I.setVisibility(0);
            return;
        }
        abstractC5319s.f20354F.setVisibility(0);
        abstractC5319s.f20357I.setVisibility(8);
        C6540v c6540v2 = this.f12751N0;
        if (c6540v2 == null) {
            AbstractC6118n.m27197o("viewModel");
            c6540v2 = null;
        }
        String str = (String) c6540v2.m27770n().m12669f();
        AbstractC5319s abstractC5319s2 = this.f12750M0;
        if (abstractC5319s2 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5319s2 = null;
        }
        Editable text = abstractC5319s2.f20353E.getText();
        String string = text != null ? text.toString() : null;
        C6540v c6540v3 = this.f12751N0;
        if (c6540v3 == null) {
            AbstractC6118n.m27197o("viewModel");
            c6540v3 = null;
        }
        C1435m c1435m = (C1435m) c6540v3.m27769l().m12669f();
        if (str == null) {
            if ((string == null || string.length() == 0) && c1435m == null) {
                abstractC5319s.f20349A.setText(getString(R.string.search_empty_title));
                abstractC5319s.f20364z.setText(getString(R.string.search_empty_message));
                return;
            } else {
                abstractC5319s.f20349A.setText(getString(R.string.no_results_for_filter));
                abstractC5319s.f20364z.setText(getString(R.string.search_empty_message));
                return;
            }
        }
        Iterator it = this.f12754Q0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC6118n.m27183a(((C5209a) next).m24098d(), str));
        C5209a c5209a = (C5209a) next;
        if (c5209a != null && c5209a.m24102h()) {
            C6540v c6540v4 = this.f12751N0;
            if (c6540v4 == null) {
                AbstractC6118n.m27197o("viewModel");
            } else {
                c6540v = c6540v4;
            }
            if (!c6540v.m27774t(str)) {
                abstractC5319s.f20349A.setText(getString(R.string.category_locked_title));
                abstractC5319s.f20364z.setText(getString(R.string.category_locked_message));
                return;
            }
        }
        if ((string == null || string.length() == 0) && c1435m == null) {
            abstractC5319s.f20349A.setText(getString(R.string.search_empty_title));
            abstractC5319s.f20364z.setText(getString(R.string.search_empty_message));
        } else {
            abstractC5319s.f20349A.setText(getString(R.string.no_results_in_category));
            abstractC5319s.f20364z.setText(getString(R.string.search_empty_message));
        }
    }

    /* JADX INFO: renamed from: z5 */
    private final void m15493z5(C6540v.a aVar) {
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a
    /* JADX INFO: renamed from: D2 */
    protected Set mo15494D2() {
        if (m15845V1()) {
            return AbstractC1617O.m6652f(AbstractActivityC3130a.d.INTERSTITIAL, AbstractActivityC3130a.d.APP_OPEN, AbstractActivityC3130a.d.NATIVE);
        }
        return null;
    }

    /* JADX INFO: renamed from: R4 */
    public final List m15495R4() {
        return this.f12755R0;
    }

    /* JADX INFO: renamed from: U4 */
    public void m15496U4(final View view, final int i7, final int i8, final String str) {
        m16252P2();
        if (i8 == R.id.more) {
            return;
        }
        m16261j3(new InterfaceC5356a() { // from class: l1.l0
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return SearchActivity.m15444V4(this.f24039a, view, i7, i8, str);
            }
        });
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        InterfaceC6701y0 interfaceC6701y0 = this.f12753P0;
        if (interfaceC6701y0 != null) {
            InterfaceC6701y0.a.m28291b(interfaceC6701y0, null, 1, null);
        }
        overridePendingTransition(R.anim.fragment_open_enter, R.anim.fragment_close_exit);
    }

    /* JADX INFO: renamed from: j5 */
    public final void m15497j5(List list) {
        AbstractC5319s abstractC5319s = this.f12750M0;
        if (abstractC5319s == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5319s = null;
        }
        abstractC5319s.f20356H.setVisibility(8);
        AbstractC6672k.m28227d(C6689s0.f24991a, null, null, new C3087a(list, null), 3, null);
    }

    @Override // com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, android.view.View.OnClickListener
    public void onClick(View view) {
        List list;
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (((numValueOf != null && numValueOf.intValue() == R.id.text_content) || ((numValueOf != null && numValueOf.intValue() == R.id.text_title) || (numValueOf != null && numValueOf.intValue() == R.id.lay_parent))) && (list = this.f12755R0) != null) {
            AbstractC6118n.m27184b(view);
            C5211c c5211c = (C5211c) AbstractC1638q.m6573M(list, Integer.parseInt(view.getTag().toString()));
            if (c5211c == null) {
                return;
            }
            startActivity(new Intent(this, (Class<?>) TextDialogActivity.class).putExtra(AbstractViewOnClickListenerC3141a.f13140d1.m16595b(), c5211c));
        }
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity, com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a, com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, com.anas_mugally.clipboard.p221ui.AbstractActivityC3140d, androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12752O0 = new C2082r(this, m15845V1());
        final AbstractC5319s abstractC5319s = (AbstractC5319s) AbstractC2473f.m10831j(this, R.layout.activity_search);
        this.f12750M0 = abstractC5319s;
        if (abstractC5319s == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5319s = null;
        }
        abstractC5319s.f20357I.setAdapter(this.f12752O0);
        abstractC5319s.f20353E.postDelayed(new Runnable() { // from class: l1.s0
            @Override // java.lang.Runnable
            public final void run() {
                SearchActivity.m15453e5(abstractC5319s, this);
            }
        }, 300L);
        abstractC5319s.f20352D.setOnClickListener(new View.OnClickListener() { // from class: l1.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchActivity.m15454f5(this.f24070a, view);
            }
        });
        abstractC5319s.f20358J.setEndIconOnClickListener(new View.OnClickListener() { // from class: l1.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchActivity.m15456g5(this.f24072a, view);
            }
        });
        abstractC5319s.f20358J.setStartIconOnClickListener(new View.OnClickListener() { // from class: l1.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchActivity.m15458h5(this.f24073a, view);
            }
        });
        C6540v c6540v = (C6540v) new C2635a0(this).m12591a(C6540v.class);
        c6540v.m27771o().m12674k(this, new C3091e(new InterfaceC5367l() { // from class: l1.w0
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return SearchActivity.m15449a5(this.f24076a, (List) obj);
            }
        }));
        c6540v.m27768k().m12674k(this, new C3091e(new InterfaceC5367l() { // from class: l1.x0
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return SearchActivity.m15450b5(this.f24079a, (C6540v.a) obj);
            }
        }));
        c6540v.m27770n().m12674k(this, new C3091e(new InterfaceC5367l() { // from class: l1.y0
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return SearchActivity.m15451c5(this.f24083a, (String) obj);
            }
        }));
        c6540v.m27769l().m12674k(this, new C3091e(new InterfaceC5367l() { // from class: l1.f0
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return SearchActivity.m15448Z4(this.f24019a, (C1435m) obj);
            }
        }));
        this.f12751N0 = c6540v;
        m15447Y4();
        AbstractC5166I.m23950b(mo12238b(), this, false, new InterfaceC5367l() { // from class: l1.g0
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return SearchActivity.m15452d5(this.f24023a, (AbstractC5158A) obj);
            }
        }, 2, null);
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity, com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a, com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onResume() {
        super.onResume();
        C6540v c6540v = this.f12751N0;
        C6540v c6540v2 = null;
        if (c6540v == null) {
            AbstractC6118n.m27197o("viewModel");
            c6540v = null;
        }
        C6540v c6540v3 = this.f12751N0;
        if (c6540v3 == null) {
            AbstractC6118n.m27197o("viewModel");
        } else {
            c6540v2 = c6540v3;
        }
        m15425A5((String) c6540v2.m27770n().m12669f());
        m15460i5();
        overridePendingTransition(R.anim.fragment_open_enter, R.anim.fragment_close_enter);
    }

    @Override // androidx.appcompat.app.AbstractActivityC2242c, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onStop() {
        super.onStop();
        C6540v c6540v = this.f12751N0;
        if (c6540v == null) {
            AbstractC6118n.m27197o("viewModel");
            c6540v = null;
        }
        c6540v.m27765h();
    }

    @Override // p238e6.InterfaceC5373r
    /* JADX INFO: renamed from: y */
    public /* bridge */ /* synthetic */ Object mo1284y(Object obj, Object obj2, Object obj3, Object obj4) {
        m15496U4((View) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), (String) obj4);
        return C1444v.f4971a;
    }
}
