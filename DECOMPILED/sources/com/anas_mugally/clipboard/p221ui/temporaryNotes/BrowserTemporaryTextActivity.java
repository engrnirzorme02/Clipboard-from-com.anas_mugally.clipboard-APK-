package com.anas_mugally.clipboard.p221ui.temporaryNotes;

import android.app.Application;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.databinding.AbstractC2473f;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h;
import androidx.lifecycle.C2635a0;
import androidx.lifecycle.InterfaceC2612D;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.AbstractC3081u;
import com.anas_mugally.clipboard.ActionsLayout;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.C3080t;
import com.anas_mugally.clipboard.MyApplication;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.database.AppDatabase;
import com.anas_mugally.clipboard.p221ui.TextDialogActivity;
import com.anas_mugally.clipboard.p221ui.WatchAdActivity;
import com.anas_mugally.clipboard.p221ui.accessibilitySetting.AccessibilitySettingFullActivity;
import com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a;
import com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity;
import com.anas_mugally.clipboard.p221ui.notes.AbstractViewOnClickListenerC3141a;
import com.anas_mugally.clipboard.p221ui.temporaryNotes.BrowserTemporaryTextActivity;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.common.api.C3553a;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.InterfaceC6113i;
import p000.C5446g;
import p145S5.AbstractC1430h;
import p145S5.C1444v;
import p145S5.InterfaceC1425c;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1617O;
import p152T5.AbstractC1638q;
import p166V5.AbstractC1792a;
import p189Z0.AbstractC2071g;
import p189Z0.AbstractC2072h;
import p223d.AbstractC5158A;
import p223d.AbstractC5166I;
import p225d1.C5210b;
import p233e1.AbstractC5299i;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p238e6.InterfaceC5373r;
import p239f.AbstractC5382c;
import p239f.C5380a;
import p239f.InterfaceC5381b;
import p241f1.C5411i;
import p247g.C5449c;
import p281k1.C5920K;
import p297m1.C6327h;
import p302m6.AbstractC6406h;
import p371v1.C7223x;
import p379w1.AbstractC7305Z;
import p395y1.C7478H;
import p395y1.C7479I;
import p405z3.C7611b;

/* JADX INFO: loaded from: classes.dex */
public final class BrowserTemporaryTextActivity extends BaseMyAppAdsActivity implements View.OnClickListener, InterfaceC5373r, AbstractC2072h.a, SwipeRefreshLayout.InterfaceC2817j {

    /* JADX INFO: renamed from: M0 */
    private AbstractC5299i f13197M0;

    /* JADX INFO: renamed from: N0 */
    private AbstractC2072h f13198N0;

    /* JADX INFO: renamed from: P0 */
    private List f13200P0;

    /* JADX INFO: renamed from: Q0 */
    private boolean f13201Q0;

    /* JADX INFO: renamed from: L0 */
    private final InterfaceC1429g f13196L0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: y1.l
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return BrowserTemporaryTextActivity.m16651K4(this.f30076a);
        }
    });

    /* JADX INFO: renamed from: O0 */
    private final InterfaceC1429g f13199O0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: y1.q
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return BrowserTemporaryTextActivity.m16642D5(this.f30085a);
        }
    });

    /* JADX INFO: renamed from: R0 */
    private final AbstractC5382c f13202R0 = m23988A0(new C5449c(), new InterfaceC5381b() { // from class: y1.r
        @Override // p239f.InterfaceC5381b
        /* JADX INFO: renamed from: a */
        public final void mo12412a(Object obj) {
            BrowserTemporaryTextActivity.m16644E5(this.f30086a, (C5380a) obj);
        }
    });

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.temporaryNotes.BrowserTemporaryTextActivity$a */
    public static final class C3145a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC1792a.m7503a(Integer.valueOf(((Number) obj2).intValue()), Integer.valueOf(((Number) obj).intValue()));
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.temporaryNotes.BrowserTemporaryTextActivity$b */
    static final class C3146b implements InterfaceC2612D, InterfaceC6113i {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ InterfaceC5367l f13203a;

        C3146b(InterfaceC5367l function) {
            AbstractC6118n.m27187e(function, "function");
            this.f13203a = function;
        }

        @Override // kotlin.jvm.internal.InterfaceC6113i
        /* JADX INFO: renamed from: a */
        public final InterfaceC1425c mo12586a() {
            return this.f13203a;
        }

        @Override // androidx.lifecycle.InterfaceC2612D
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void mo12097b(Object obj) {
            this.f13203a.invoke(obj);
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

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.temporaryNotes.BrowserTemporaryTextActivity$c */
    public static final class C3147c implements TextWatcher {
        public C3147c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (BrowserTemporaryTextActivity.this.f13201Q0) {
                String string = AbstractC6406h.m27594S0(String.valueOf(editable)).toString();
                AbstractC5299i abstractC5299i = null;
                String str = string.length() == 0 ? null : string;
                if (BrowserTemporaryTextActivity.this.m16662X4()) {
                    BrowserTemporaryTextActivity.this.mo12238b().m23939s();
                }
                AbstractC5299i abstractC5299i2 = BrowserTemporaryTextActivity.this.f13197M0;
                if (abstractC5299i2 == null) {
                    AbstractC6118n.m27197o("binding");
                } else {
                    abstractC5299i = abstractC5299i2;
                }
                abstractC5299i.f20244E.setRefreshing(true);
                C7479I.m33122k(BrowserTemporaryTextActivity.this.m16657R4(), BrowserTemporaryTextActivity.this, str, true, -1, 0, 16, null);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A5 */
    public static final C1444v m16636A5(BrowserTemporaryTextActivity browserTemporaryTextActivity) {
        browserTemporaryTextActivity.m16640C5();
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: B5 */
    private final boolean m16638B5() {
        SharedPreferences sharedPreferencesM15843T1 = m15843T1();
        C6327h.a aVar = C6327h.f24159H0;
        if (sharedPreferencesM15843T1.getBoolean(aVar.m27282b(), false) || !C3034A.f12453a.m15015B(this)) {
            return false;
        }
        aVar.m27281a().mo7649g2(m12232H0(), null);
        return true;
    }

    /* JADX INFO: renamed from: C5 */
    private final void m16640C5() {
        this.f13201Q0 = true;
        AbstractC5299i abstractC5299i = this.f13197M0;
        AbstractC5299i abstractC5299i2 = null;
        if (abstractC5299i == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5299i = null;
        }
        abstractC5299i.f20247x.setVisibility(8);
        AbstractC5299i abstractC5299i3 = this.f13197M0;
        if (abstractC5299i3 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5299i2 = abstractC5299i3;
        }
        abstractC5299i2.f20241B.setEnabled(true);
        mo14014F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D5 */
    public static final C7479I m16642D5(BrowserTemporaryTextActivity browserTemporaryTextActivity) {
        return (C7479I) new C2635a0(browserTemporaryTextActivity).m12591a(C7479I.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E5 */
    public static final void m16644E5(BrowserTemporaryTextActivity browserTemporaryTextActivity, C5380a result) {
        AbstractC6118n.m27187e(result, "result");
        int iM24390b = result.m24390b();
        if (iM24390b == 100) {
            List list = browserTemporaryTextActivity.f13200P0;
            if (list == null) {
                return;
            }
            C7478H c7478hM16654N4 = browserTemporaryTextActivity.m16654N4();
            C5210b c5210b = (C5210b) AbstractC1638q.m6573M(list, c7478hM16654N4 != null ? c7478hM16654N4.m33117i0() : -1);
            if (c5210b == null) {
                return;
            }
            C7478H c7478hM16654N5 = browserTemporaryTextActivity.m16654N4();
            if (c7478hM16654N5 != null) {
                c7478hM16654N5.m33119o0(-1);
            }
            browserTemporaryTextActivity.m16665a5(c5210b.m24105b());
        } else if (iM24390b == 101) {
            View view = new View(browserTemporaryTextActivity.getApplication());
            view.setId(R.id.in_app_purchasing);
            browserTemporaryTextActivity.onClick(view);
        }
        C7478H c7478hM16654N6 = browserTemporaryTextActivity.m16654N4();
        if (c7478hM16654N6 != null) {
            c7478hM16654N6.m33119o0(-1);
        }
    }

    /* JADX INFO: renamed from: F5 */
    private final void m16646F5() {
        long j7 = m15843T1().getLong(C3034A.f12453a.m15043r(), -1L);
        if (j7 != -1) {
            m16657R4().m33124f(this, j7);
        }
    }

    /* JADX INFO: renamed from: I4 */
    private final void m16649I4() {
        Application application = getApplication();
        AbstractC6118n.m27186d(application, "getApplication(...)");
        boolean zM15315b = AbstractC3081u.m15315b(application);
        boolean z7 = !zM15315b;
        if (!zM15315b || !m15843T1().getBoolean(C3034A.f12453a.m15033g(), true)) {
            m16698t5(z7);
            return;
        }
        if (m16664Z4()) {
            m16706x5();
            return;
        }
        this.f13201Q0 = true;
        AbstractC5299i abstractC5299i = this.f13197M0;
        AbstractC5299i abstractC5299i2 = null;
        if (abstractC5299i == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5299i = null;
        }
        abstractC5299i.f20247x.setVisibility(8);
        AbstractC5299i abstractC5299i3 = this.f13197M0;
        if (abstractC5299i3 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5299i2 = abstractC5299i3;
        }
        abstractC5299i2.f20241B.setEnabled(true);
    }

    /* JADX INFO: renamed from: J4 */
    private final void m16650J4() {
        if (this.f13201Q0) {
            m16657R4().m33123e(this);
            Toast.makeText(this, getString(R.string.all_temporary_texts_cleared), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K4 */
    public static final AppDatabase m16651K4(BrowserTemporaryTextActivity browserTemporaryTextActivity) {
        return AppDatabase.f12597p.m15148b(browserTemporaryTextActivity);
    }

    /* JADX INFO: renamed from: L4 */
    private final void m16652L4(Integer[] numArr) {
        if (this.f13201Q0) {
            m16657R4().m33125g(this, numArr);
            Toast.makeText(this, getString(R.string.deleted_successfully), 0).show();
        }
    }

    /* JADX INFO: renamed from: M4 */
    private final ActionsLayout m16653M4() {
        AbstractC5299i abstractC5299i = this.f13197M0;
        if (abstractC5299i == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5299i = null;
        }
        return (ActionsLayout) abstractC5299i.f20240A.findViewById(R.id.toolbar);
    }

    /* JADX INFO: renamed from: N4 */
    private final C7478H m16654N4() {
        AbstractC5299i abstractC5299i = this.f13197M0;
        if (abstractC5299i == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5299i = null;
        }
        return (C7478H) abstractC5299i.f20243D.getAdapter();
    }

    /* JADX INFO: renamed from: O4 */
    private final AppDatabase m16655O4() {
        return (AppDatabase) this.f13196L0.getValue();
    }

    /* JADX INFO: renamed from: Q4 */
    private final String m16656Q4() {
        return m15843T1().getString(C3034A.f12453a.m15046u(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public final C7479I m16657R4() {
        return (C7479I) this.f13199O0.getValue();
    }

    /* JADX INFO: renamed from: S4 */
    private final void m16658S4() {
        AbstractC2072h abstractC2072h;
        List listM8541E;
        int iM33118j0;
        if (this.f13201Q0 && (abstractC2072h = this.f13198N0) != null) {
            int size = abstractC2072h.m8566M().size();
            List listM8541E2 = abstractC2072h.m8541E();
            AbstractC6118n.m27184b(listM8541E2);
            int i7 = 0;
            boolean z7 = size == listM8541E2.size();
            abstractC2072h.m8566M().clear();
            if (!z7 && (listM8541E = abstractC2072h.m8541E()) != null) {
                if (abstractC2072h.m8545I()) {
                    C7478H c7478hM16654N4 = m16654N4();
                    AbstractC6118n.m27184b(c7478hM16654N4);
                    iM33118j0 = c7478hM16654N4.m33118j0();
                } else {
                    iM33118j0 = C3553a.e.API_PRIORITY_OTHER;
                }
                List listC0 = AbstractC1638q.m6589c0(listM8541E, iM33118j0);
                if (listC0 != null) {
                    for (Object obj : listC0) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            AbstractC1638q.m6773r();
                        }
                        HashSet hashSetM8566M = abstractC2072h.m8566M();
                        AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type com.anas_mugally.clipboard.database.entity.TemporaryText");
                        hashSetM8566M.add(Integer.valueOf(((C5210b) obj).m24104a()));
                        i7 = i8;
                    }
                }
            }
            abstractC2072h.m13322l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public static final C1444v m16659U4(BrowserTemporaryTextActivity browserTemporaryTextActivity, View view, int i7, int i8, String str) {
        browserTemporaryTextActivity.m16660V4(view, i7, i8, str);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: V4 */
    private final void m16660V4(View view, final int i7, int i8, String str) {
        List list;
        String strM24105b;
        if (this.f13201Q0 && (list = this.f13200P0) != null && i7 <= list.size()) {
            List list2 = this.f13200P0;
            AbstractC6118n.m27184b(list2);
            C5210b c5210b = (C5210b) AbstractC1638q.m6573M(list2, i7);
            if (c5210b != null && (strM24105b = c5210b.m24105b()) != null) {
                str = strM24105b;
            } else if (str == null) {
                str = "";
            }
            if (AbstractC3041D.m15081f(this, str)) {
                if (i8 == R.id.delete) {
                    C3034A.f12453a.m15023J(this, 1, new InterfaceC5356a() { // from class: y1.g
                        @Override // p238e6.InterfaceC5356a
                        public final Object invoke() {
                            return BrowserTemporaryTextActivity.m16661W4(this.f30071a, i7);
                        }
                    });
                } else {
                    C5920K c5920k = new C5920K(this, str, m16662X4());
                    AbstractC6118n.m27184b(view);
                    c5920k.m26717s(view, m16655O4());
                    c5920k.m26716i(i8);
                }
                m16638B5();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4 */
    public static final C1444v m16661W4(BrowserTemporaryTextActivity browserTemporaryTextActivity, int i7) {
        List list = browserTemporaryTextActivity.f13200P0;
        AbstractC6118n.m27184b(list);
        C5210b c5210b = (C5210b) AbstractC1638q.m6573M(list, i7);
        if (c5210b != null) {
            browserTemporaryTextActivity.m16652L4(new Integer[]{Integer.valueOf(c5210b.m24104a())});
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public final boolean m16662X4() {
        AbstractC5299i abstractC5299i = this.f13197M0;
        if (abstractC5299i == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5299i = null;
        }
        View mainCardBtnsOps = abstractC5299i.f20240A;
        AbstractC6118n.m27186d(mainCardBtnsOps, "mainCardBtnsOps");
        return mainCardBtnsOps.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: Y4 */
    private final boolean m16663Y4() {
        return m15843T1().getBoolean(C3034A.f12453a.m15045t(), false);
    }

    /* JADX INFO: renamed from: Z4 */
    private final boolean m16664Z4() {
        String strM16656Q4 = m16656Q4();
        return !(strM16656Q4 == null || strM16656Q4.length() == 0);
    }

    /* JADX INFO: renamed from: a5 */
    private final void m16665a5(String str) {
        if (AbstractC3041D.m15081f(this, str)) {
            C5446g.m24648f(C5446g.f20735a, this, str, new ComponentName(this, (Class<?>) TextDialogActivity.class), null, 0, 12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b5 */
    public static final boolean m16666b5(final BrowserTemporaryTextActivity browserTemporaryTextActivity, MenuItem it) {
        Object next;
        String strM24105b;
        AbstractC6118n.m27187e(it, "it");
        AbstractC2072h abstractC2072h = browserTemporaryTextActivity.f13198N0;
        AbstractC6118n.m27184b(abstractC2072h);
        final HashSet hashSetM8566M = abstractC2072h.m8566M();
        final int itemId = it.getItemId();
        if (hashSetM8566M.isEmpty() && itemId != R.id.select_all) {
            Toast.makeText(browserTemporaryTextActivity, R.string.empty_text, 0).show();
            return true;
        }
        if (itemId == R.id.delete) {
            C3034A.f12453a.m15023J(browserTemporaryTextActivity, hashSetM8566M.size(), new InterfaceC5356a() { // from class: y1.n
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return BrowserTemporaryTextActivity.m16667c5(this.f30078a, hashSetM8566M);
                }
            });
        } else if (itemId != R.id.select_all) {
            List listB0 = AbstractC1638q.m6588b0(hashSetM8566M, new C3145a());
            ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(listB0, 10));
            Iterator it2 = listB0.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                List list = browserTemporaryTextActivity.f13200P0;
                AbstractC6118n.m27184b(list);
                Iterator it3 = list.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (((C5210b) next).m24104a() != iIntValue);
                C5210b c5210b = (C5210b) next;
                if (c5210b == null || (strM24105b = c5210b.m24105b()) == null) {
                    strM24105b = "";
                }
                arrayList.add(strM24105b);
            }
            new C7223x(browserTemporaryTextActivity, arrayList).m31879m(new C7223x.a() { // from class: y1.o
                @Override // p371v1.C7223x.a
                /* JADX INFO: renamed from: a */
                public final void mo16605a(String str) {
                    BrowserTemporaryTextActivity.m16668d5(this.f30080a, itemId, str);
                }
            });
        } else {
            browserTemporaryTextActivity.m16658S4();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c5 */
    public static final C1444v m16667c5(BrowserTemporaryTextActivity browserTemporaryTextActivity, HashSet hashSet) {
        browserTemporaryTextActivity.m16652L4((Integer[]) hashSet.toArray(new Integer[0]));
        browserTemporaryTextActivity.mo12238b().m23939s();
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d5 */
    public static final void m16668d5(BrowserTemporaryTextActivity browserTemporaryTextActivity, int i7, String combinedText) {
        AbstractC6118n.m27187e(combinedText, "combinedText");
        if (AbstractC3041D.m15081f(browserTemporaryTextActivity, combinedText)) {
            ImageButton imageButton = browserTemporaryTextActivity.m16653M4().getItemViewMap().get(Integer.valueOf(R.id.save));
            AbstractC6118n.m27184b(imageButton);
            browserTemporaryTextActivity.m16712T4(imageButton, -1, i7, combinedText);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e5 */
    public static final C1444v m16669e5(final BrowserTemporaryTextActivity browserTemporaryTextActivity, final ComponentName componentName, final ActionsLayout.EnumC3037c type) {
        Object next;
        String strM24105b;
        AbstractC6118n.m27187e(type, "type");
        AbstractC2072h abstractC2072h = browserTemporaryTextActivity.f13198N0;
        AbstractC6118n.m27184b(abstractC2072h);
        HashSet hashSetM8566M = abstractC2072h.m8566M();
        if (hashSetM8566M.isEmpty()) {
            Toast.makeText(browserTemporaryTextActivity, R.string.empty_text, 0).show();
            return C1444v.f4971a;
        }
        ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(hashSetM8566M, 10));
        Iterator it = hashSetM8566M.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            List list = browserTemporaryTextActivity.f13200P0;
            AbstractC6118n.m27184b(list);
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((C5210b) next).m24104a() != iIntValue);
            C5210b c5210b = (C5210b) next;
            if (c5210b == null || (strM24105b = c5210b.m24105b()) == null) {
                strM24105b = "";
            }
            arrayList.add(strM24105b);
        }
        new C7223x(browserTemporaryTextActivity, arrayList).m31879m(new C7223x.a() { // from class: y1.p
            @Override // p371v1.C7223x.a
            /* JADX INFO: renamed from: a */
            public final void mo16605a(String str) {
                BrowserTemporaryTextActivity.m16670f5(this.f30082a, componentName, type, str);
            }
        });
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f5 */
    public static final void m16670f5(BrowserTemporaryTextActivity browserTemporaryTextActivity, ComponentName componentName, ActionsLayout.EnumC3037c enumC3037c, String combinedText) {
        AbstractC6118n.m27187e(combinedText, "combinedText");
        if (AbstractC3041D.m15081f(browserTemporaryTextActivity, combinedText)) {
            AbstractC3041D.m15089n(browserTemporaryTextActivity, combinedText, componentName, enumC3037c, browserTemporaryTextActivity.m16662X4());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g5 */
    public static final C1444v m16672g5(BrowserTemporaryTextActivity browserTemporaryTextActivity, AbstractC5158A addCallback) {
        AbstractC6118n.m27187e(addCallback, "$this$addCallback");
        AbstractC5299i abstractC5299i = browserTemporaryTextActivity.f13197M0;
        AbstractC5299i abstractC5299i2 = null;
        if (abstractC5299i == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5299i = null;
        }
        abstractC5299i.f20240A.setVisibility(8);
        AbstractC5299i abstractC5299i3 = browserTemporaryTextActivity.f13197M0;
        if (abstractC5299i3 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5299i2 = abstractC5299i3;
        }
        abstractC5299i2.f20246w.setVisibility(0);
        AbstractC2072h abstractC2072h = browserTemporaryTextActivity.f13198N0;
        if (abstractC2072h != null) {
            abstractC2072h.m8568O(false);
        }
        addCallback.m23913h();
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h5 */
    public static final void m16674h5(BrowserTemporaryTextActivity browserTemporaryTextActivity, DialogInterface dialogInterface, int i7) {
        browserTemporaryTextActivity.m16650J4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i5 */
    public static final C1444v m16676i5(BrowserTemporaryTextActivity browserTemporaryTextActivity, AbstractC5158A addCallback) {
        AbstractC6118n.m27187e(addCallback, "$this$addCallback");
        if (!browserTemporaryTextActivity.f13201Q0) {
            addCallback.m23915j(false);
            browserTemporaryTextActivity.finishAndRemoveTask();
            return C1444v.f4971a;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC5299i abstractC5299i = browserTemporaryTextActivity.f13197M0;
            AbstractC5299i abstractC5299i2 = null;
            if (abstractC5299i == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5299i = null;
            }
            if (abstractC5299i.f20241B.isFocused()) {
                AbstractC5299i abstractC5299i3 = browserTemporaryTextActivity.f13197M0;
                if (abstractC5299i3 == null) {
                    AbstractC6118n.m27197o("binding");
                } else {
                    abstractC5299i2 = abstractC5299i3;
                }
                abstractC5299i2.f20241B.clearFocus();
                return C1444v.f4971a;
            }
        }
        addCallback.m23915j(false);
        browserTemporaryTextActivity.finishAndRemoveTask();
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: j5 */
    private final void m16678j5(List list) {
        this.f13200P0 = list;
        m16686n5(list);
    }

    /* JADX INFO: renamed from: k5 */
    private final void m16680k5() {
        m16657R4().m33127i().m12674k(this, new C3146b(new InterfaceC5367l() { // from class: y1.v
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return BrowserTemporaryTextActivity.m16682l5(this.f30094a, (List) obj);
            }
        }));
        m16657R4().m33126h().m12674k(this, new C3146b(new InterfaceC5367l() { // from class: y1.w
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return BrowserTemporaryTextActivity.m16684m5(this.f30095a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l5 */
    public static final C1444v m16682l5(BrowserTemporaryTextActivity browserTemporaryTextActivity, List list) {
        if (!browserTemporaryTextActivity.f13201Q0) {
            return C1444v.f4971a;
        }
        browserTemporaryTextActivity.m16678j5(list);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m5 */
    public static final C1444v m16684m5(BrowserTemporaryTextActivity browserTemporaryTextActivity, Boolean bool) {
        Log.d("anas_loadmore", String.valueOf(bool));
        if (!browserTemporaryTextActivity.f13201Q0) {
            return C1444v.f4971a;
        }
        C7478H c7478hM16654N4 = browserTemporaryTextActivity.m16654N4();
        AbstractC6118n.m27184b(c7478hM16654N4);
        c7478hM16654N4.m8560R(bool.booleanValue());
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: n5 */
    private final void m16686n5(List list) {
        if (this.f13201Q0) {
            AbstractC5299i abstractC5299i = this.f13197M0;
            AbstractC5299i abstractC5299i2 = null;
            if (abstractC5299i == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5299i = null;
            }
            String string = AbstractC6406h.m27594S0(String.valueOf(abstractC5299i.f20241B.getText())).toString();
            if (string.length() == 0) {
                string = null;
            }
            C7478H c7478hM16654N4 = m16654N4();
            if (c7478hM16654N4 == null) {
                c7478hM16654N4 = new C7478H(this, m15845V1());
                AbstractC5299i abstractC5299i3 = this.f13197M0;
                if (abstractC5299i3 == null) {
                    AbstractC6118n.m27197o("binding");
                    abstractC5299i3 = null;
                }
                abstractC5299i3.f20243D.setAdapter(c7478hM16654N4);
                c7478hM16654N4.m8561S(new AbstractC2071g.b() { // from class: y1.c
                    @Override // p189Z0.AbstractC2071g.b
                    /* JADX INFO: renamed from: a */
                    public final void mo8565a() {
                        BrowserTemporaryTextActivity.m16688o5(this.f30067a);
                    }
                });
            }
            c7478hM16654N4.m33120p0(string != null);
            c7478hM16654N4.m8546K(list);
            AbstractC5299i abstractC5299i4 = this.f13197M0;
            if (abstractC5299i4 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5299i2 = abstractC5299i4;
            }
            abstractC5299i2.f20244E.postDelayed(new Runnable() { // from class: y1.d
                @Override // java.lang.Runnable
                public final void run() {
                    BrowserTemporaryTextActivity.m16690p5(this.f30068a);
                }
            }, 700L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o5 */
    public static final void m16688o5(BrowserTemporaryTextActivity browserTemporaryTextActivity) {
        C5210b c5210b;
        AbstractC5299i abstractC5299i = browserTemporaryTextActivity.f13197M0;
        if (abstractC5299i == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5299i = null;
        }
        abstractC5299i.f20244E.setRefreshing(true);
        AbstractC5299i abstractC5299i2 = browserTemporaryTextActivity.f13197M0;
        if (abstractC5299i2 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5299i2 = null;
        }
        String string = AbstractC6406h.m27594S0(String.valueOf(abstractC5299i2.f20241B.getText())).toString();
        String str = string.length() == 0 ? null : string;
        C7479I c7479iM16657R4 = browserTemporaryTextActivity.m16657R4();
        List list = browserTemporaryTextActivity.f13200P0;
        C7479I.m33122k(c7479iM16657R4, browserTemporaryTextActivity, str, false, (list == null || (c5210b = (C5210b) AbstractC1638q.m6580T(list)) == null) ? -1 : c5210b.m24104a(), 0, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public static final void m16690p5(BrowserTemporaryTextActivity browserTemporaryTextActivity) {
        AbstractC5299i abstractC5299i = browserTemporaryTextActivity.f13197M0;
        if (abstractC5299i == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5299i = null;
        }
        abstractC5299i.f20244E.setRefreshing(false);
    }

    /* JADX INFO: renamed from: q5 */
    private final void m16692q5() {
        AbstractC5299i abstractC5299i = this.f13197M0;
        if (abstractC5299i == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5299i = null;
        }
        TextInputEditText search = abstractC5299i.f20241B;
        AbstractC6118n.m27186d(search, "search");
        search.addTextChangedListener(new C3147c());
    }

    /* JADX INFO: renamed from: r5 */
    private final void m16694r5() {
        AbstractC5299i abstractC5299i = this.f13197M0;
        AbstractC5299i abstractC5299i2 = null;
        if (abstractC5299i == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5299i = null;
        }
        abstractC5299i.f20246w.setOnClickListener(this);
        AbstractC5299i abstractC5299i3 = this.f13197M0;
        if (abstractC5299i3 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5299i3 = null;
        }
        abstractC5299i3.f20248y.setOnClickListener(new View.OnClickListener() { // from class: y1.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BrowserTemporaryTextActivity.m16696s5(this.f30096a, view);
            }
        });
        AbstractC5299i abstractC5299i4 = this.f13197M0;
        if (abstractC5299i4 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5299i4 = null;
        }
        abstractC5299i4.f20244E.setOnRefreshListener(this);
        AbstractC5299i abstractC5299i5 = this.f13197M0;
        if (abstractC5299i5 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5299i5 = null;
        }
        abstractC5299i5.f20243D.setLayoutManager(new LinearLayoutManager(this));
        AbstractC5299i abstractC5299i6 = this.f13197M0;
        if (abstractC5299i6 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5299i6 = null;
        }
        RecyclerView recyclerView = abstractC5299i6.f20243D;
        AbstractC5299i abstractC5299i7 = this.f13197M0;
        if (abstractC5299i7 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5299i2 = abstractC5299i7;
        }
        recyclerView.m13182l(new C3080t(abstractC5299i2.f20246w, true));
        m16692q5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s5 */
    public static final void m16696s5(BrowserTemporaryTextActivity browserTemporaryTextActivity, View view) {
        AbstractC7305Z.m32303a(browserTemporaryTextActivity);
        browserTemporaryTextActivity.finishAndRemoveTask();
    }

    /* JADX INFO: renamed from: t5 */
    private final void m16698t5(final boolean z7) {
        AbstractC5299i abstractC5299i = this.f13197M0;
        AbstractC5299i abstractC5299i2 = null;
        if (abstractC5299i == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5299i = null;
        }
        abstractC5299i.f20247x.setVisibility(0);
        AbstractC5299i abstractC5299i3 = this.f13197M0;
        if (abstractC5299i3 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5299i3 = null;
        }
        abstractC5299i3.f20247x.setImageResource(R.drawable.outline_block_24);
        AbstractC5299i abstractC5299i4 = this.f13197M0;
        if (abstractC5299i4 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5299i4 = null;
        }
        abstractC5299i4.f20247x.setOnClickListener(new View.OnClickListener() { // from class: y1.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BrowserTemporaryTextActivity.m16700u5(this.f30065a, z7, view);
            }
        });
        if (this.f13201Q0) {
            return;
        }
        AbstractC5299i abstractC5299i5 = this.f13197M0;
        if (abstractC5299i5 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5299i2 = abstractC5299i5;
        }
        abstractC5299i2.f20247x.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u5 */
    public static final void m16700u5(final BrowserTemporaryTextActivity browserTemporaryTextActivity, boolean z7, View view) {
        if (browserTemporaryTextActivity.f13201Q0) {
            return;
        }
        new C7611b(browserTemporaryTextActivity).m33365P(R.string.send_text_to_external_title).m33354E(z7 ? R.string.enable_pro_feutre_temporary : R.string.enable__temporary).m33361L(R.string.activation, new DialogInterface.OnClickListener() { // from class: y1.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                BrowserTemporaryTextActivity.m16702v5(this.f30073a, dialogInterface, i7);
            }
        }).m33356G(R.string.cancel, new DialogInterface.OnClickListener() { // from class: y1.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                BrowserTemporaryTextActivity.m16704w5(dialogInterface, i7);
            }
        }).mo9100d(false).m9118v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v5 */
    public static final void m16702v5(BrowserTemporaryTextActivity browserTemporaryTextActivity, DialogInterface dialogInterface, int i7) {
        browserTemporaryTextActivity.startActivity(new Intent(browserTemporaryTextActivity, (Class<?>) AccessibilitySettingFullActivity.class).addFlags(872415232));
        browserTemporaryTextActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w5 */
    public static final void m16704w5(DialogInterface dialogInterface, int i7) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: x5 */
    private final void m16706x5() {
        AbstractC5299i abstractC5299i = this.f13197M0;
        AbstractC5299i abstractC5299i2 = null;
        if (abstractC5299i == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5299i = null;
        }
        abstractC5299i.f20247x.setVisibility(0);
        AbstractC5299i abstractC5299i3 = this.f13197M0;
        if (abstractC5299i3 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5299i3 = null;
        }
        abstractC5299i3.f20247x.setOnClickListener(new View.OnClickListener() { // from class: y1.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BrowserTemporaryTextActivity.m16708y5(this.f30093a, view);
            }
        });
        if (this.f13201Q0) {
            return;
        }
        AbstractC5299i abstractC5299i4 = this.f13197M0;
        if (abstractC5299i4 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5299i2 = abstractC5299i4;
        }
        abstractC5299i2.f20247x.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y5 */
    public static final void m16708y5(final BrowserTemporaryTextActivity browserTemporaryTextActivity, View view) {
        if (browserTemporaryTextActivity.f13201Q0) {
            return;
        }
        C5411i c5411iM24530a = C5411i.f20591L0.m24530a(browserTemporaryTextActivity.m16663Y4());
        c5411iM24530a.m24529y2(new InterfaceC5371p() { // from class: y1.e
            @Override // p238e6.InterfaceC5371p
            public final Object invoke(Object obj, Object obj2) {
                return BrowserTemporaryTextActivity.m16710z5(this.f30069a, (String) obj, (C5411i) obj2);
            }
        });
        c5411iM24530a.m24528x2(new InterfaceC5356a() { // from class: y1.f
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return BrowserTemporaryTextActivity.m16636A5(this.f30070a);
            }
        });
        c5411iM24530a.mo7649g2(browserTemporaryTextActivity.m12232H0(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z5 */
    public static final C1444v m16710z5(BrowserTemporaryTextActivity browserTemporaryTextActivity, String password, C5411i dialog) {
        AbstractC6118n.m27187e(password, "password");
        AbstractC6118n.m27187e(dialog, "dialog");
        if (AbstractC6118n.m27183a(password, browserTemporaryTextActivity.m16656Q4())) {
            dialog.mo12082T1();
            browserTemporaryTextActivity.m16640C5();
        } else {
            dialog.m24526B2();
        }
        return C1444v.f4971a;
    }

    @Override // p189Z0.AbstractC2072h.a
    /* JADX INFO: renamed from: C */
    public void mo8569C(AbstractC2072h adapter) {
        Menu menu;
        AbstractC6118n.m27187e(adapter, "adapter");
        if (this.f13201Q0) {
            m16252P2();
            this.f13198N0 = adapter;
            if (Build.VERSION.SDK_INT < 28 && (menu = m16653M4().getMenu()) != null) {
                menu.removeItem(R.id.send_text);
            }
            m16653M4().setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: y1.j
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return BrowserTemporaryTextActivity.m16666b5(this.f30074a, menuItem);
                }
            });
            m16653M4().setOnMoreAppsItemClickListener(new InterfaceC5371p() { // from class: y1.k
                @Override // p238e6.InterfaceC5371p
                public final Object invoke(Object obj, Object obj2) {
                    return BrowserTemporaryTextActivity.m16669e5(this.f30075a, (ComponentName) obj, (ActionsLayout.EnumC3037c) obj2);
                }
            });
            AbstractC5166I.m23950b(mo12238b(), this, false, new InterfaceC5367l() { // from class: y1.m
                @Override // p238e6.InterfaceC5367l
                public final Object invoke(Object obj) {
                    return BrowserTemporaryTextActivity.m16672g5(this.f30077a, (AbstractC5158A) obj);
                }
            }, 2, null);
            AbstractC5299i abstractC5299i = this.f13197M0;
            AbstractC5299i abstractC5299i2 = null;
            if (abstractC5299i == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5299i = null;
            }
            abstractC5299i.f20240A.setVisibility(0);
            AbstractC5299i abstractC5299i3 = this.f13197M0;
            if (abstractC5299i3 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5299i2 = abstractC5299i3;
            }
            abstractC5299i2.f20246w.setVisibility(8);
        }
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a
    /* JADX INFO: renamed from: D2 */
    protected Set mo15494D2() {
        if (m15845V1()) {
            return AbstractC1617O.m6652f(AbstractActivityC3130a.d.INTERSTITIAL, AbstractActivityC3130a.d.APP_OPEN, AbstractActivityC3130a.d.NATIVE);
        }
        return null;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC2817j
    /* JADX INFO: renamed from: F */
    public void mo14014F() {
        if (this.f13201Q0) {
            AbstractC5299i abstractC5299i = this.f13197M0;
            AbstractC5299i abstractC5299i2 = null;
            if (abstractC5299i == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5299i = null;
            }
            if (!abstractC5299i.f20241B.isFocused()) {
                C7479I.m33122k(m16657R4(), this, null, true, -1, 0, 16, null);
                return;
            }
            AbstractC5299i abstractC5299i3 = this.f13197M0;
            if (abstractC5299i3 == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5299i3 = null;
            }
            Editable text = abstractC5299i3.f20241B.getText();
            if (text != null) {
                text.clear();
            }
            AbstractC5299i abstractC5299i4 = this.f13197M0;
            if (abstractC5299i4 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5299i2 = abstractC5299i4;
            }
            abstractC5299i2.f20241B.clearFocus();
        }
    }

    /* JADX INFO: renamed from: P4 */
    public final boolean m16711P4() {
        return getIntent().hasExtra(AbstractViewOnClickListenerC3141a.f13140d1.m16596c());
    }

    /* JADX INFO: renamed from: T4 */
    public void m16712T4(final View view, final int i7, final int i8, final String str) {
        m16252P2();
        if (this.f13201Q0 && i8 != R.id.more) {
            m16261j3(new InterfaceC5356a() { // from class: y1.t
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return BrowserTemporaryTextActivity.m16659U4(this.f30088a, view, i7, i8, str);
                }
            });
        }
    }

    @Override // com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a
    /* JADX INFO: renamed from: W1 */
    public void mo15563W1(Purchase purchase) {
        AbstractC6118n.m27187e(purchase, "purchase");
        super.mo15563W1(purchase);
        if (m15845V1()) {
            return;
        }
        C7478H c7478hM16654N4 = m16654N4();
        if (c7478hM16654N4 != null) {
            c7478hM16654N4.m8547L(m15845V1());
        }
        C7478H c7478hM16654N5 = m16654N4();
        if (c7478hM16654N5 != null) {
            c7478hM16654N5.m33119o0(-1);
        }
        C7478H c7478hM16654N6 = m16654N4();
        if (c7478hM16654N6 != null) {
            c7478hM16654N6.m13322l();
        }
        setResult(-1);
    }

    @Override // com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, android.view.View.OnClickListener
    public void onClick(View view) {
        C5210b c5210b;
        C7478H c7478hM16654N4;
        if (this.f13201Q0 || (view != null && view.getId() == R.id.img_blocking_access_to_nots)) {
            super.onClick(view);
            AbstractC6118n.m27184b(view);
            switch (view.getId()) {
                case R.id.actions /* 2131296327 */:
                case R.id.lay_parent /* 2131296713 */:
                case R.id.text_content /* 2131297058 */:
                case R.id.text_title /* 2131297086 */:
                    if (m15845V1() && ((c7478hM16654N4 = m16654N4()) == null || c7478hM16654N4.m33117i0() != -1)) {
                        WatchAdActivity.C3108a c3108a = WatchAdActivity.f12879J0;
                        String string = getString(R.string.watch_ad_view_temporary_text_reward);
                        AbstractC6118n.m27186d(string, "getString(...)");
                        this.f13202R0.m24394a(WatchAdActivity.C3108a.m15789b(c3108a, this, string, null, null, null, 28, null));
                        break;
                    } else {
                        List list = this.f13200P0;
                        if (list != null && (c5210b = (C5210b) AbstractC1638q.m6573M(list, Integer.parseInt(view.getTag().toString()))) != null) {
                            m16665a5(c5210b.m24105b());
                            break;
                        }
                    }
                    break;
                case R.id.ftl_btn_clear_all /* 2131296602 */:
                    new C7611b(this).m33365P(R.string.clear_all_temporary_texts).m33354E(R.string.are_you_sure_clear_all).m33361L(R.string.confirm, new DialogInterface.OnClickListener() { // from class: y1.s
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i7) {
                            BrowserTemporaryTextActivity.m16674h5(this.f30087a, dialogInterface, i7);
                        }
                    }).m33356G(R.string.cancel, null).m9118v();
                    break;
                default:
                    break;
            }
        }
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity, com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a, com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, com.anas_mugally.clipboard.p221ui.AbstractActivityC3140d, androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m16646F5();
        this.f13197M0 = (AbstractC5299i) AbstractC2473f.m10831j(this, R.layout.activity_browse_tempolary_text);
        m16694r5();
        m16680k5();
        m16649I4();
        AbstractC5166I.m23950b(mo12238b(), this, false, new InterfaceC5367l() { // from class: y1.a
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return BrowserTemporaryTextActivity.m16676i5(this.f30064a, (AbstractC5158A) obj);
            }
        }, 2, null);
        if (this.f13201Q0) {
            mo14014F();
        }
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a, androidx.appcompat.app.AbstractActivityC2242c, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onStart() {
        super.onStart();
        Application application = getApplication();
        AbstractC6118n.m27185c(application, "null cannot be cast to non-null type com.anas_mugally.clipboard.MyApplication");
        MyApplication.m15101k((MyApplication) application, false, 1, null);
    }

    @Override // androidx.appcompat.app.AbstractActivityC2242c, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onStop() {
        List<AbstractComponentCallbacksC2591i> listM12401u0 = m12232H0().m12401u0();
        AbstractC6118n.m27186d(listM12401u0, "getFragments(...)");
        for (AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i : listM12401u0) {
            if (abstractComponentCallbacksC2591i instanceof DialogInterfaceOnCancelListenerC2590h) {
                ((DialogInterfaceOnCancelListenerC2590h) abstractComponentCallbacksC2591i).mo12082T1();
            }
        }
        super.onStop();
    }

    @Override // p238e6.InterfaceC5373r
    /* JADX INFO: renamed from: y */
    public /* bridge */ /* synthetic */ Object mo1284y(Object obj, Object obj2, Object obj3, Object obj4) {
        m16712T4((View) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), (String) obj4);
        return C1444v.f4971a;
    }
}
