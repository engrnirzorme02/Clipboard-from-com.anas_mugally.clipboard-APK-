package com.anas_mugally.clipboard.p221ui.scrollExtractTexts;

import android.content.ComponentName;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.databinding.AbstractC2473f;
import androidx.viewpager2.widget.ViewPager2;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.ActionsLayout;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.database.AppDatabase;
import com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a;
import com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity;
import com.anas_mugally.clipboard.p221ui.scrollExtractTexts.ViewNodesActivity;
import com.google.android.material.tabs.C4620d;
import com.google.android.material.tabs.TabLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1430h;
import p145S5.C1435m;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1617O;
import p152T5.AbstractC1638q;
import p166V5.AbstractC1792a;
import p189Z0.AbstractC2072h;
import p223d.AbstractC5158A;
import p223d.AbstractC5166I;
import p233e1.AbstractC5255A;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p238e6.InterfaceC5372q;
import p281k1.C5920K;
import p302m6.AbstractC6406h;
import p302m6.C6405g;
import p371v1.C7223x;
import p379w1.AbstractC7305Z;
import p387x1.C7390h;
import p387x1.C7392j;

/* JADX INFO: loaded from: classes.dex */
public final class ViewNodesActivity extends BaseMyAppAdsActivity implements InterfaceC5372q, AbstractC2072h.a {

    /* JADX INFO: renamed from: L0 */
    private AbstractC5255A f13186L0;

    /* JADX INFO: renamed from: M0 */
    private ViewPager2 f13187M0;

    /* JADX INFO: renamed from: N0 */
    private TabLayout f13188N0;

    /* JADX INFO: renamed from: S0 */
    private AbstractC2072h f13193S0;

    /* JADX INFO: renamed from: O0 */
    private final ArrayList f13189O0 = new ArrayList();

    /* JADX INFO: renamed from: P0 */
    private final Map f13190P0 = new LinkedHashMap();

    /* JADX INFO: renamed from: Q0 */
    private final Map f13191Q0 = new LinkedHashMap();

    /* JADX INFO: renamed from: R0 */
    private final C7392j f13192R0 = new C7392j(this);

    /* JADX INFO: renamed from: T0 */
    private final InterfaceC1429g f13194T0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: x1.k
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return ViewNodesActivity.m16626r4(this.f29631a);
        }
    });

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.scrollExtractTexts.ViewNodesActivity$a */
    public static final class C3143a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC1792a.m7503a((Integer) ((Map.Entry) obj2).getValue(), (Integer) ((Map.Entry) obj).getValue());
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.scrollExtractTexts.ViewNodesActivity$b */
    public static final class C3144b extends ViewPager2.AbstractC2879i {
        C3144b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2879i
        /* JADX INFO: renamed from: c */
        public void mo3697c(int i7) {
            if (ViewNodesActivity.this.m16633z4()) {
                ViewNodesActivity.this.mo12238b().m23939s();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public static final boolean m16606A4(final ViewNodesActivity viewNodesActivity, List list, final ActionsLayout actionsLayout, MenuItem it) {
        AbstractC6118n.m27187e(it, "it");
        AbstractC2072h abstractC2072h = viewNodesActivity.f13193S0;
        AbstractC6118n.m27184b(abstractC2072h);
        HashSet hashSetM8566M = abstractC2072h.m8566M();
        final int itemId = it.getItemId();
        if (hashSetM8566M.isEmpty() && itemId != R.id.select_all) {
            Toast.makeText(viewNodesActivity, R.string.empty_text, 0).show();
            return true;
        }
        if (itemId == R.id.select_all) {
            viewNodesActivity.m16630v4();
        } else {
            ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(hashSetM8566M, 10));
            Iterator it2 = hashSetM8566M.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                AbstractC6118n.m27184b(list);
                String str = (String) AbstractC1638q.m6573M(list, iIntValue);
                if (str == null) {
                    str = "";
                }
                arrayList.add(str);
            }
            new C7223x(viewNodesActivity, arrayList).m31879m(new C7223x.a() { // from class: x1.t
                @Override // p371v1.C7223x.a
                /* JADX INFO: renamed from: a */
                public final void mo16605a(String str2) {
                    ViewNodesActivity.m16607B4(this.f29647a, actionsLayout, itemId, str2);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public static final void m16607B4(ViewNodesActivity viewNodesActivity, ActionsLayout actionsLayout, int i7, String combinedText) {
        AbstractC6118n.m27187e(combinedText, "combinedText");
        if (AbstractC3041D.m15081f(viewNodesActivity, combinedText)) {
            ImageButton imageButton = actionsLayout.getItemViewMap().get(Integer.valueOf(R.id.save));
            AbstractC6118n.m27184b(imageButton);
            viewNodesActivity.m16634w4(imageButton, i7, combinedText);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public static final C1444v m16608C4(final ViewNodesActivity viewNodesActivity, List list, final ComponentName componentName, final ActionsLayout.EnumC3037c type) {
        AbstractC6118n.m27187e(type, "type");
        AbstractC2072h abstractC2072h = viewNodesActivity.f13193S0;
        AbstractC6118n.m27184b(abstractC2072h);
        HashSet hashSetM8566M = abstractC2072h.m8566M();
        if (hashSetM8566M.isEmpty()) {
            Toast.makeText(viewNodesActivity, R.string.empty_text, 0).show();
            return C1444v.f4971a;
        }
        ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(hashSetM8566M, 10));
        Iterator it = hashSetM8566M.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            AbstractC6118n.m27184b(list);
            String str = (String) AbstractC1638q.m6573M(list, iIntValue);
            if (str == null) {
                str = "";
            }
            arrayList.add(str);
        }
        new C7223x(viewNodesActivity, arrayList).m31879m(new C7223x.a() { // from class: x1.s
            @Override // p371v1.C7223x.a
            /* JADX INFO: renamed from: a */
            public final void mo16605a(String str2) {
                ViewNodesActivity.m16609D4(this.f29644a, componentName, type, str2);
            }
        });
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D4 */
    public static final void m16609D4(ViewNodesActivity viewNodesActivity, ComponentName componentName, ActionsLayout.EnumC3037c enumC3037c, String combinedText) {
        AbstractC6118n.m27187e(combinedText, "combinedText");
        if (AbstractC3041D.m15081f(viewNodesActivity, combinedText)) {
            AbstractC3041D.m15089n(viewNodesActivity, combinedText, componentName, enumC3037c, viewNodesActivity.m16633z4());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public static final void m16610E4(ViewNodesActivity viewNodesActivity, View view) {
        AbstractC7305Z.m32303a(viewNodesActivity);
        viewNodesActivity.finishAndRemoveTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public static final C1444v m16611F4(ViewNodesActivity viewNodesActivity, AbstractC5158A addCallback) {
        AbstractC6118n.m27187e(addCallback, "$this$addCallback");
        if (viewNodesActivity.m16633z4()) {
            viewNodesActivity.m16629u4().setVisibility(8);
            AbstractC2072h abstractC2072h = viewNodesActivity.f13193S0;
            if (abstractC2072h != null) {
                abstractC2072h.m8568O(false);
            }
        } else {
            addCallback.m23915j(false);
            viewNodesActivity.finishAndRemoveTask();
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: G4 */
    private final void m16612G4() {
        Map map = this.f13190P0;
        ArrayList arrayList = this.f13189O0;
        ArrayList arrayList2 = new ArrayList(AbstractC1638q.m6774s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((C1435m) it.next()).m6070c());
        }
        map.put("All", new ArrayList(arrayList2));
        this.f13191Q0.put("All", Integer.valueOf(this.f13189O0.size()));
        Iterator it2 = this.f13189O0.iterator();
        AbstractC6118n.m27186d(it2, "iterator(...)");
        while (it2.hasNext()) {
            Object next = it2.next();
            AbstractC6118n.m27186d(next, "next(...)");
            C1435m c1435m = (C1435m) next;
            if (c1435m.m6071d() == null || AbstractC6118n.m27183a(c1435m.m6071d(), "null")) {
                if (!this.f13190P0.containsKey("Unknown ID")) {
                    this.f13190P0.put("Unknown ID", new ArrayList());
                }
                ArrayList arrayList3 = (ArrayList) this.f13190P0.get("Unknown ID");
                if (arrayList3 != null) {
                    arrayList3.add(c1435m.m6070c());
                }
                Map map2 = this.f13191Q0;
                Integer num = (Integer) map2.get("Unknown ID");
                map2.put("Unknown ID", Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            } else {
                Object objM6071d = c1435m.m6071d();
                AbstractC6118n.m27184b(objM6071d);
                String strM16627s4 = m16627s4((String) objM6071d);
                if (!this.f13190P0.containsKey(strM16627s4)) {
                    this.f13190P0.put(strM16627s4, new ArrayList());
                }
                ArrayList arrayList4 = (ArrayList) this.f13190P0.get(strM16627s4);
                if (arrayList4 != null) {
                    arrayList4.add(c1435m.m6070c());
                }
                Map map3 = this.f13191Q0;
                Integer num2 = (Integer) map3.get(strM16627s4);
                map3.put(strM16627s4, Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1));
            }
        }
        List listB0 = AbstractC1638q.m6588b0(this.f13191Q0.entrySet(), new C3143a());
        C7392j c7392j = this.f13192R0;
        ArrayList arrayList5 = new ArrayList(AbstractC1638q.m6774s(listB0, 10));
        Iterator it3 = listB0.iterator();
        while (it3.hasNext()) {
            arrayList5.add((String) ((Map.Entry) it3.next()).getKey());
        }
        c7392j.m32728W(arrayList5, this.f13190P0);
    }

    /* JADX INFO: renamed from: H4 */
    private final void m16613H4() {
        ViewPager2 viewPager2 = this.f13187M0;
        ViewPager2 viewPager3 = null;
        if (viewPager2 == null) {
            AbstractC6118n.m27197o("viewPager2");
            viewPager2 = null;
        }
        viewPager2.setAdapter(this.f13192R0);
        ViewPager2 viewPager4 = this.f13187M0;
        if (viewPager4 == null) {
            AbstractC6118n.m27197o("viewPager2");
            viewPager4 = null;
        }
        viewPager4.m14395g(new C3144b());
        TabLayout tabLayout = this.f13188N0;
        if (tabLayout == null) {
            AbstractC6118n.m27197o("tabLayout");
            tabLayout = null;
        }
        ViewPager2 viewPager5 = this.f13187M0;
        if (viewPager5 == null) {
            AbstractC6118n.m27197o("viewPager2");
        } else {
            viewPager3 = viewPager5;
        }
        new C4620d(tabLayout, viewPager3, new C4620d.b() { // from class: x1.o
            @Override // com.google.android.material.tabs.C4620d.b
            /* JADX INFO: renamed from: a */
            public final void mo21412a(TabLayout.C4613g c4613g, int i7) {
                ViewNodesActivity.m16614I4(this.f29638a, c4613g, i7);
            }
        }).m21410a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I4 */
    public static final void m16614I4(ViewNodesActivity viewNodesActivity, TabLayout.C4613g tab, int i7) {
        AbstractC6118n.m27187e(tab, "tab");
        tab.m21381n(viewNodesActivity.f13192R0.m32727V(i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public static final FrameLayout m16626r4(ViewNodesActivity viewNodesActivity) {
        return (FrameLayout) viewNodesActivity.findViewById(R.id.main_card_btns_ops);
    }

    /* JADX INFO: renamed from: s4 */
    private final String m16627s4(String str) {
        List listG0 = AbstractC6406h.m27574G0(str, new String[]{":id/"}, false, 0, 6, null);
        String str2 = listG0.size() > 1 ? (String) listG0.get(1) : str;
        AbstractC6118n.m27184b(str2);
        String strM27530b = new C6405g("([a-z])([A-Z])").m27530b(AbstractC6406h.m27551E(str2, "_", " ", false, 4, null), "$1 $2");
        Locale locale = Locale.getDefault();
        AbstractC6118n.m27186d(locale, "getDefault(...)");
        String lowerCase = strM27530b.toLowerCase(locale);
        AbstractC6118n.m27186d(lowerCase, "toLowerCase(...)");
        return AbstractC1638q.m6578R(AbstractC6406h.m27574G0(lowerCase, new String[]{" "}, false, 0, 6, null), " ", null, null, 0, null, new InterfaceC5367l() { // from class: x1.p
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return ViewNodesActivity.m16628t4((String) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public static final CharSequence m16628t4(String word) {
        AbstractC6118n.m27187e(word, "word");
        if (word.length() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String strValueOf = String.valueOf(word.charAt(0));
        AbstractC6118n.m27185c(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        AbstractC6118n.m27186d(upperCase, "toUpperCase(...)");
        sb.append(upperCase);
        String strSubstring = word.substring(1);
        AbstractC6118n.m27186d(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    /* JADX INFO: renamed from: u4 */
    private final FrameLayout m16629u4() {
        Object value = this.f13194T0.getValue();
        AbstractC6118n.m27186d(value, "getValue(...)");
        return (FrameLayout) value;
    }

    /* JADX INFO: renamed from: v4 */
    private final void m16630v4() {
        List listM8541E;
        AbstractC2072h abstractC2072h = this.f13193S0;
        if (abstractC2072h != null) {
            int size = abstractC2072h.m8566M().size();
            List listM8541E2 = abstractC2072h.m8541E();
            AbstractC6118n.m27184b(listM8541E2);
            int i7 = 0;
            boolean z7 = size == listM8541E2.size();
            abstractC2072h.m8566M().clear();
            if (!z7 && (listM8541E = abstractC2072h.m8541E()) != null) {
                Iterator it = listM8541E.iterator();
                while (it.hasNext()) {
                    it.next();
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        AbstractC1638q.m6773r();
                    }
                    abstractC2072h.m8566M().add(Integer.valueOf(i7));
                    i7 = i8;
                }
            }
            abstractC2072h.m13322l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public static final C1444v m16631x4(ViewNodesActivity viewNodesActivity, View view, int i7, String str) {
        viewNodesActivity.m16632y4(view, i7, str);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: y4 */
    private final void m16632y4(View view, int i7, String str) {
        AbstractC6118n.m27184b(str);
        C5920K c5920k = new C5920K(this, str, m16633z4());
        AbstractC6118n.m27184b(view);
        c5920k.m26717s(view, AppDatabase.f12597p.m15148b(this));
        c5920k.m26716i(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public final boolean m16633z4() {
        FrameLayout frameLayoutM16629u4 = m16629u4();
        AbstractC6118n.m27184b(frameLayoutM16629u4);
        return frameLayoutM16629u4.getVisibility() == 0;
    }

    @Override // p189Z0.AbstractC2072h.a
    /* JADX INFO: renamed from: C */
    public void mo8569C(AbstractC2072h adapter) {
        AbstractC6118n.m27187e(adapter, "adapter");
        m16252P2();
        this.f13193S0 = adapter;
        final ActionsLayout actionsLayout = (ActionsLayout) m16629u4().findViewById(R.id.toolbar);
        actionsLayout.removeItem(R.id.delete);
        final List listM8541E = ((C7390h) adapter).m8541E();
        actionsLayout.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: x1.q
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return ViewNodesActivity.m16606A4(this.f29639a, listM8541E, actionsLayout, menuItem);
            }
        });
        actionsLayout.setOnMoreAppsItemClickListener(new InterfaceC5371p() { // from class: x1.r
            @Override // p238e6.InterfaceC5371p
            public final Object invoke(Object obj, Object obj2) {
                return ViewNodesActivity.m16608C4(this.f29642a, listM8541E, (ComponentName) obj, (ActionsLayout.EnumC3037c) obj2);
            }
        });
        FrameLayout frameLayoutM16629u4 = m16629u4();
        AbstractC6118n.m27184b(frameLayoutM16629u4);
        frameLayoutM16629u4.setVisibility(0);
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a
    /* JADX INFO: renamed from: D2 */
    protected Set mo15494D2() {
        if (m15845V1()) {
            return AbstractC1617O.m6652f(AbstractActivityC3130a.d.INTERSTITIAL, AbstractActivityC3130a.d.APP_OPEN, AbstractActivityC3130a.d.NATIVE);
        }
        return null;
    }

    @Override // p238e6.InterfaceC5372q
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ Object mo7830j(Object obj, Object obj2, Object obj3) {
        m16634w4((View) obj, ((Number) obj2).intValue(), (String) obj3);
        return C1444v.f4971a;
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity, com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a, com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, com.anas_mugally.clipboard.p221ui.AbstractActivityC3140d, androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC5255A abstractC5255A = (AbstractC5255A) AbstractC2473f.m10831j(this, R.layout.activity_view_nodes);
        this.f13186L0 = abstractC5255A;
        if (abstractC5255A == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5255A = null;
        }
        this.f13187M0 = abstractC5255A.f20008A;
        AbstractC5255A abstractC5255A2 = this.f13186L0;
        if (abstractC5255A2 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5255A2 = null;
        }
        this.f13188N0 = abstractC5255A2.f20013z;
        AbstractC5255A abstractC5255A3 = this.f13186L0;
        if (abstractC5255A3 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5255A3 = null;
        }
        abstractC5255A3.f20010w.setOnClickListener(new View.OnClickListener() { // from class: x1.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewNodesActivity.m16610E4(this.f29636a, view);
            }
        });
        Serializable serializableExtra = getIntent().getSerializableExtra("list");
        ArrayList arrayList = serializableExtra instanceof ArrayList ? (ArrayList) serializableExtra : null;
        if (arrayList != null) {
            this.f13189O0.addAll(arrayList);
            m16612G4();
        }
        m16613H4();
        AbstractC5166I.m23950b(mo12238b(), this, false, new InterfaceC5367l() { // from class: x1.n
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return ViewNodesActivity.m16611F4(this.f29637a, (AbstractC5158A) obj);
            }
        }, 2, null);
    }

    /* JADX INFO: renamed from: w4 */
    public void m16634w4(final View view, final int i7, final String str) {
        m16252P2();
        if (str == null || !AbstractC3041D.m15081f(this, str) || i7 == R.id.more) {
            return;
        }
        m16261j3(new InterfaceC5356a() { // from class: x1.l
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return ViewNodesActivity.m16631x4(this.f29632a, view, i7, str);
            }
        });
    }
}
