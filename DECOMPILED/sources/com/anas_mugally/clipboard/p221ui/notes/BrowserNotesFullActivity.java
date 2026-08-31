package com.anas_mugally.clipboard.p221ui.notes;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC2473f;
import androidx.recyclerview.widget.RecyclerView;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.MyApplication;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.GoogleSignInActivity;
import com.anas_mugally.clipboard.p221ui.SearchActivity;
import com.anas_mugally.clipboard.p221ui.SectionActivity;
import com.anas_mugally.clipboard.p221ui.UserProfileActivity;
import com.anas_mugally.clipboard.p221ui.notes.BrowserNotesFullActivity;
import com.anas_mugally.clipboard.p221ui.p222ai.AiTextProcessingActivity;
import com.anas_mugally.clipboard.p221ui.temporaryNotes.BrowserTemporaryTextActivity;
import com.android.billingclient.api.Purchase;
import com.bumptech.glide.C3211k;
import com.bumptech.glide.ComponentCallbacks2C3202b;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.AbstractC4880u;
import com.google.firebase.auth.FirebaseAuth;
import kotlin.jvm.internal.AbstractC6118n;
import p033E.C0247b;
import p091L1.C0821n;
import p111O.AbstractC1030Z;
import p111O.AbstractC1061m0;
import p111O.C0982A0;
import p111O.InterfaceC0993G;
import p145S5.AbstractC1430h;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p223d.AbstractC5158A;
import p223d.AbstractC5166I;
import p233e1.AbstractC5295g;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p239f.AbstractC5382c;
import p239f.C5380a;
import p239f.InterfaceC5381b;
import p241f1.C5425w;
import p247g.C5449c;

/* JADX INFO: loaded from: classes.dex */
public final class BrowserNotesFullActivity extends AbstractViewOnClickListenerC3141a implements View.OnClickListener, NavigationView.InterfaceC4552d, Toolbar.InterfaceC2332h {

    /* JADX INFO: renamed from: h1 */
    private final String f13136h1 = "show_case_toolbar";

    /* JADX INFO: renamed from: i1 */
    private final InterfaceC1429g f13137i1 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: w1.S
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return BrowserNotesFullActivity.m16483g6(this.f29143a);
        }
    });

    /* JADX INFO: renamed from: j1 */
    private final AbstractC5382c f13138j1 = m23988A0(new C5449c(), new InterfaceC5381b() { // from class: w1.T
        @Override // p239f.InterfaceC5381b
        /* JADX INFO: renamed from: a */
        public final void mo12412a(Object obj) {
            BrowserNotesFullActivity.m16493q6(this.f29144a, (C5380a) obj);
        }
    });

    /* JADX INFO: renamed from: k1 */
    private final AbstractC5382c f13139k1 = m23988A0(new C5449c(), new InterfaceC5381b() { // from class: w1.U
        @Override // p239f.InterfaceC5381b
        /* JADX INFO: renamed from: a */
        public final void mo12412a(Object obj) {
            BrowserNotesFullActivity.m16496t6(this.f29145a, (C5380a) obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g6 */
    public static final AbstractC5295g m16483g6(BrowserNotesFullActivity browserNotesFullActivity) {
        return (AbstractC5295g) AbstractC2473f.m10831j(browserNotesFullActivity, R.layout.activity_browse_note_fullscreen);
    }

    /* JADX INFO: renamed from: h6 */
    private final AbstractC5295g m16484h6() {
        Object value = this.f13137i1.getValue();
        AbstractC6118n.m27186d(value, "getValue(...)");
        return (AbstractC5295g) value;
    }

    /* JADX INFO: renamed from: i6 */
    private final AbstractC4880u m16485i6() {
        return FirebaseAuth.getInstance().m21989e();
    }

    /* JADX INFO: renamed from: j6 */
    private final boolean m16486j6() {
        return isInMultiWindowMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k6 */
    public static final void m16487k6(BrowserNotesFullActivity browserNotesFullActivity, View view) {
        browserNotesFullActivity.m16484h6().f20223C.m11682G(browserNotesFullActivity.m16484h6().f20225E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l6 */
    public static final C1444v m16488l6(BrowserNotesFullActivity browserNotesFullActivity, AbstractC5158A addCallback) {
        AbstractC6118n.m27187e(addCallback, "$this$addCallback");
        AbstractC5295g abstractC5295gM16484h6 = browserNotesFullActivity.m16484h6();
        if (abstractC5295gM16484h6.f20223C.m11678A(abstractC5295gM16484h6.f20225E)) {
            abstractC5295gM16484h6.f20223C.m11694f();
        } else {
            addCallback.m23915j(false);
            browserNotesFullActivity.mo12238b().m23939s();
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m6 */
    public static final C1444v m16489m6(String errorMessage) {
        AbstractC6118n.m27187e(errorMessage, "errorMessage");
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: n6 */
    private final void m16490n6() {
        startActivity(new Intent(this, (Class<?>) BrowserTemporaryTextActivity.class).putExtra(AbstractViewOnClickListenerC3141a.f13140d1.m16596c(), true));
    }

    /* JADX INFO: renamed from: o6 */
    private final void m16491o6() {
        if (m16486j6()) {
            return;
        }
        AbstractC1061m0.m4703b(getWindow(), false);
        AbstractC1030Z.m4494t0(m16484h6().m10849k(), new InterfaceC0993G() { // from class: w1.X
            @Override // p111O.InterfaceC0993G
            /* JADX INFO: renamed from: a */
            public final C0982A0 mo4369a(View view, C0982A0 c0982a0) {
                return BrowserNotesFullActivity.m16492p6(this.f29148a, view, c0982a0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p6 */
    public static final C0982A0 m16492p6(BrowserNotesFullActivity browserNotesFullActivity, View view, C0982A0 windowInsets) {
        AbstractC6118n.m27187e(view, "view");
        AbstractC6118n.m27187e(windowInsets, "windowInsets");
        C0247b c0247bM4272f = windowInsets.m4272f(C0982A0.p.m4332e());
        AbstractC6118n.m27186d(c0247bM4272f, "getInsets(...)");
        View viewStatusBar = browserNotesFullActivity.m16484h6().f20229I;
        AbstractC6118n.m27186d(viewStatusBar, "viewStatusBar");
        ViewGroup.LayoutParams layoutParams = viewStatusBar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = c0247bM4272f.f985b;
        viewStatusBar.setLayoutParams(layoutParams);
        ExtendedFloatingActionButton fltBtnAddText = browserNotesFullActivity.m16484h6().f20232x;
        AbstractC6118n.m27186d(fltBtnAddText, "fltBtnAddText");
        ViewGroup.LayoutParams layoutParams2 = fltBtnAddText.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.C2408b c2408b = (ConstraintLayout.C2408b) layoutParams2;
        ((ViewGroup.MarginLayoutParams) c2408b).bottomMargin = c0247bM4272f.f987d + 60;
        fltBtnAddText.setLayoutParams(c2408b);
        if (C3034A.f12453a.m15018E(browserNotesFullActivity)) {
            AppBarLayout appBarMain = browserNotesFullActivity.m16484h6().f20230v;
            AbstractC6118n.m27186d(appBarMain, "appBarMain");
            appBarMain.setPadding(appBarMain.getPaddingLeft(), appBarMain.getPaddingTop(), c0247bM4272f.f986c, appBarMain.getPaddingBottom());
            RecyclerView swipeTarget = browserNotesFullActivity.m16484h6().f20226F;
            AbstractC6118n.m27186d(swipeTarget, "swipeTarget");
            swipeTarget.setPadding(swipeTarget.getPaddingLeft(), swipeTarget.getPaddingTop(), c0247bM4272f.f986c, swipeTarget.getPaddingBottom());
            ExtendedFloatingActionButton fltBtnAddText2 = browserNotesFullActivity.m16484h6().f20232x;
            AbstractC6118n.m27186d(fltBtnAddText2, "fltBtnAddText");
            ViewGroup.LayoutParams layoutParams3 = fltBtnAddText2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams.rightMargin = c0247bM4272f.f986c * 2;
            fltBtnAddText2.setLayoutParams(marginLayoutParams);
        } else {
            View mainCardBtnsOps = browserNotesFullActivity.m16484h6().f20224D;
            AbstractC6118n.m27186d(mainCardBtnsOps, "mainCardBtnsOps");
            mainCardBtnsOps.setPadding(mainCardBtnsOps.getPaddingLeft(), mainCardBtnsOps.getPaddingTop(), mainCardBtnsOps.getPaddingRight(), c0247bM4272f.f987d);
        }
        return C0982A0.f3748b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q6 */
    public static final void m16493q6(BrowserNotesFullActivity browserNotesFullActivity, C5380a result) {
        AbstractC6118n.m27187e(result, "result");
        browserNotesFullActivity.m16494r6();
    }

    /* JADX INFO: renamed from: r6 */
    private final void m16494r6() {
        String string;
        Uri uriMo8708Y;
        View viewM20860n = m16484h6().f20225E.m20860n(0);
        viewM20860n.setOnClickListener(new View.OnClickListener() { // from class: w1.Y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BrowserNotesFullActivity.m16495s6(this.f29149a, view);
            }
        });
        ImageView imageView = (ImageView) viewM20860n.findViewById(R.id.img);
        AbstractC4880u abstractC4880uM16485i6 = m16485i6();
        if (abstractC4880uM16485i6 == null || (uriMo8708Y = abstractC4880uM16485i6.mo8708Y()) == null || ((C3211k) ((C3211k) ((C3211k) ComponentCallbacks2C3202b.m16995u(this).m17078s(uriMo8708Y).m6957f0(new C0821n())).m6942U(R.drawable.ic_account_circle)).m6958g(R.drawable.ic_account_circle)).m17065w0(imageView) == null) {
            imageView.setImageResource(R.mipmap.ic_launcher);
            C1444v c1444v = C1444v.f4971a;
        }
        TextView textView = (TextView) viewM20860n.findViewById(R.id.name);
        AbstractC4880u abstractC4880uM16485i7 = m16485i6();
        if (abstractC4880uM16485i7 == null || (string = abstractC4880uM16485i7.mo8704U()) == null) {
            string = getString(R.string.app_name);
            AbstractC6118n.m27186d(string, "getString(...)");
        }
        textView.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s6 */
    public static final void m16495s6(BrowserNotesFullActivity browserNotesFullActivity, View view) {
        if (browserNotesFullActivity.m16485i6() == null) {
            browserNotesFullActivity.f13138j1.m24394a(GoogleSignInActivity.f12744j0.m15423a(browserNotesFullActivity));
        } else {
            browserNotesFullActivity.f13139k1.m24394a(UserProfileActivity.f12875i0.m15760a(browserNotesFullActivity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t6 */
    public static final void m16496t6(BrowserNotesFullActivity browserNotesFullActivity, C5380a result) {
        AbstractC6118n.m27187e(result, "result");
        browserNotesFullActivity.m16494r6();
    }

    @Override // com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a
    /* JADX INFO: renamed from: W1 */
    public void mo15563W1(Purchase purchase) {
        AbstractC6118n.m27187e(purchase, "purchase");
        super.mo15563W1(purchase);
        Log.d("anas_recrate", "onPurchased");
        if (m15845V1()) {
            return;
        }
        recreate();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.material.navigation.NavigationView.InterfaceC4552d
    /* JADX INFO: renamed from: f */
    public boolean mo16497f(MenuItem item) {
        AbstractC6118n.m27187e(item, "item");
        AbstractC5295g abstractC5295gM16484h6 = m16484h6();
        abstractC5295gM16484h6.f20225E.getMenu().getItem(0).setChecked(true);
        abstractC5295gM16484h6.f20223C.m11692d(m16484h6().f20225E);
        switch (item.getItemId()) {
            case R.id.in_app_purchasing /* 2131296655 */:
                View view = new View(this);
                view.setId(R.id.in_app_purchasing);
                onClick(view);
                return false;
            case R.id.item_about /* 2131296674 */:
                C3034A.f12453a.m15019F(this, "https://clipzboard.com/en/about-clipz-app");
                return false;
            case R.id.item_ai_text_processing /* 2131296675 */:
                startActivity(new Intent(this, (Class<?>) AiTextProcessingActivity.class).putExtra(AbstractViewOnClickListenerC3141a.f13140d1.m16596c(), true));
                return false;
            case R.id.item_categories /* 2131296676 */:
                startActivityForResult(new Intent(this, (Class<?>) SectionActivity.class), m16589a5());
                return false;
            case R.id.item_my_app /* 2131296680 */:
                MyApplication.f12496a.m15108d(this, AbstractC3041D.m15083h(this));
                return false;
            case R.id.item_privacy_policy /* 2131296682 */:
                MyApplication.C3043a c3043a = MyApplication.f12496a;
                c3043a.m15108d(this, c3043a.m15106b());
                return false;
            case R.id.item_pro_setting /* 2131296683 */:
                m16592w5(false);
                return false;
            case R.id.item_report_problem /* 2131296684 */:
                new C5425w(this).m24596f(!m15845V1(), new InterfaceC5367l() { // from class: w1.Q
                    @Override // p238e6.InterfaceC5367l
                    public final Object invoke(Object obj) {
                        return BrowserNotesFullActivity.m16489m6((String) obj);
                    }
                });
                return false;
            case R.id.item_setting /* 2131296686 */:
                m16593y5(false);
                return false;
            case R.id.item_share_app /* 2131296687 */:
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", getString(R.string.share_app_for_friend) + " \n \n" + AbstractC3041D.m15082g(this));
                startActivity(intent);
                return false;
            case R.id.item_temporary_texts /* 2131296688 */:
                m16490n6();
                return false;
            default:
                return false;
        }
    }

    @Override // com.anas_mugally.clipboard.p221ui.notes.AbstractViewOnClickListenerC3141a, com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity, com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a, com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, com.anas_mugally.clipboard.p221ui.AbstractActivityC3140d, androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        AbstractC5295g abstractC5295gM16484h6 = m16484h6();
        super.onCreate(bundle);
        m16491o6();
        Toolbar toolbar = abstractC5295gM16484h6.f20228H;
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: w1.V
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BrowserNotesFullActivity.m16487k6(this.f29146a, view);
            }
        });
        toolbar.setOnMenuItemClickListener(this);
        abstractC5295gM16484h6.f20232x.setOnClickListener(this);
        NavigationView navigationView = abstractC5295gM16484h6.f20225E;
        m16494r6();
        navigationView.getMenu().findItem(R.id.in_app_purchasing).setVisible(m15845V1());
        navigationView.setNavigationItemSelectedListener(this);
        AbstractC5166I.m23950b(mo12238b(), this, false, new InterfaceC5367l() { // from class: w1.W
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return BrowserNotesFullActivity.m16488l6(this.f29147a, (AbstractC5158A) obj);
            }
        }, 2, null);
    }

    @Override // androidx.appcompat.widget.Toolbar.InterfaceC2332h
    public boolean onMenuItemClick(MenuItem item) {
        AbstractC6118n.m27187e(item, "item");
        int itemId = item.getItemId();
        if (itemId == R.id.item_ai_text_processing) {
            startActivity(new Intent(this, (Class<?>) AiTextProcessingActivity.class).putExtra(AbstractViewOnClickListenerC3141a.f13140d1.m16596c(), true));
        } else if (itemId == R.id.item_search) {
            startActivityForResult(new Intent(this, (Class<?>) SearchActivity.class), m16590b5());
        } else if (itemId == R.id.item_temporary_texts) {
            m16490n6();
        }
        return true;
    }
}
