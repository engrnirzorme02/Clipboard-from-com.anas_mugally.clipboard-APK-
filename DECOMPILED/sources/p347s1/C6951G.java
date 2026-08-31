package p347s1;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.fragment.app.AbstractActivityC2592j;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import androidx.lifecycle.AbstractC2658t;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a;
import com.anas_mugally.clipboard.p221ui.p222ai.AiTextProcessingActivity;
import com.anas_mugally.clipboard.p221ui.p222ai.models.ProcessingResultData;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p233e1.AbstractC5266I;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6672k;
import p318o6.InterfaceC6624N;
import p355t1.AbstractC7071b;

/* JADX INFO: renamed from: s1.G */
/* JADX INFO: loaded from: classes.dex */
public final class C6951G extends AbstractComponentCallbacksC2591i {

    /* JADX INFO: renamed from: p0 */
    private AbstractC5266I f27912p0;

    /* JADX INFO: renamed from: q0 */
    private boolean f27913q0;

    /* JADX INFO: renamed from: r0 */
    private boolean f27914r0;

    /* JADX INFO: renamed from: o0 */
    private final ViewTreeObserver.OnGlobalLayoutListener f27911o0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: s1.E
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            C6951G.m30494X1(this.f27909a);
        }
    };

    /* JADX INFO: renamed from: s0 */
    private final InterfaceC1429g f27915s0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: s1.F
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return C6951G.m30500f2(this.f27910a);
        }
    });

    /* JADX INFO: renamed from: s1.G$a */
    static final class a extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f27916a;

        a(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C6951G.this.new a(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f27916a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                C6951G c6951g = C6951G.this;
                this.f27916a = 1;
                if (c6951g.m30499e2(this) == objE) {
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

    /* JADX INFO: renamed from: s1.G$b */
    public static final class b implements TextWatcher {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC5266I f27918a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5367l f27919b;

        public b(AbstractC5266I abstractC5266I, InterfaceC5367l interfaceC5367l) {
            this.f27918a = abstractC5266I;
            this.f27919b = interfaceC5367l;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f27918a.f20070H.setText(String.valueOf(editable != null ? editable.length() : 0));
            this.f27919b.invoke(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    /* JADX INFO: renamed from: s1.G$c */
    static final class c extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f27920a;

        /* JADX INFO: renamed from: b */
        Object f27921b;

        /* JADX INFO: renamed from: c */
        int f27922c;

        /* JADX INFO: renamed from: d */
        int f27923d;

        /* JADX INFO: renamed from: e */
        /* synthetic */ Object f27924e;

        /* JADX INFO: renamed from: r */
        int f27926r;

        c(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f27924e = obj;
            this.f27926r |= Integer.MIN_VALUE;
            return C6951G.this.m30499e2(this);
        }
    }

    /* JADX INFO: renamed from: V1 */
    private final AbstractViewOnClickListenerC3111a m30492V1() {
        AbstractActivityC2592j abstractActivityC2592jM12211x1 = m12211x1();
        AbstractC6118n.m27185c(abstractActivityC2592jM12211x1, "null cannot be cast to non-null type com.anas_mugally.clipboard.ui.BaseBillingActivity");
        return (AbstractViewOnClickListenerC3111a) abstractActivityC2592jM12211x1;
    }

    /* JADX INFO: renamed from: W1 */
    private final List m30493W1() {
        return (List) this.f27915s0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public static final void m30494X1(C6951G c6951g) {
        int iM15016C;
        Rect rect = new Rect();
        AbstractC5266I abstractC5266I = c6951g.f27912p0;
        AbstractC5266I abstractC5266I2 = null;
        if (abstractC5266I == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5266I = null;
        }
        View viewM10849k = abstractC5266I.m10849k();
        AbstractC6118n.m27186d(viewM10849k, "getRoot(...)");
        viewM10849k.getWindowVisibleDisplayFrame(rect);
        int height = viewM10849k.getRootView().getHeight();
        boolean z7 = ((double) (height - rect.bottom)) > ((double) height) * 0.15d;
        if (z7 != c6951g.f27914r0) {
            c6951g.f27914r0 = z7;
            AbstractC5266I abstractC5266I3 = c6951g.f27912p0;
            if (abstractC5266I3 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5266I2 = abstractC5266I3;
            }
            ScrollView layoutResult = abstractC5266I2.f20065C;
            AbstractC6118n.m27186d(layoutResult, "layoutResult");
            ViewGroup.LayoutParams layoutParams = layoutResult.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (c6951g.f27914r0) {
                int iHeight = rect.height();
                C3034A c3034a = C3034A.f12453a;
                Context contextM12214y1 = c6951g.m12214y1();
                AbstractC6118n.m27186d(contextM12214y1, "requireContext(...)");
                iM15016C = iHeight - (c3034a.m15016C(contextM12214y1) * 2);
                int i7 = marginLayoutParams.height;
                if (i7 > iM15016C) {
                    iM15016C = i7;
                }
            } else {
                iM15016C = -2;
            }
            marginLayoutParams.height = iM15016C;
            layoutResult.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    private final void m30495Y1() {
        AbstractC5266I abstractC5266I = this.f27912p0;
        if (abstractC5266I == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5266I = null;
        }
        abstractC5266I.f20072w.setOnClickListener(new View.OnClickListener() { // from class: s1.C
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6951G.m30496Z1(this.f27907a, view);
            }
        });
        abstractC5266I.f20074y.setOnClickListener(m30492V1());
        abstractC5266I.f20073x.setOnClickListener(new View.OnClickListener() { // from class: s1.D
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6951G.m30497a2(this.f27908a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public static final void m30496Z1(C6951G c6951g, View view) {
        AbstractActivityC2592j abstractActivityC2592jM12184m = c6951g.m12184m();
        AiTextProcessingActivity aiTextProcessingActivity = abstractActivityC2592jM12184m instanceof AiTextProcessingActivity ? (AiTextProcessingActivity) abstractActivityC2592jM12184m : null;
        if (aiTextProcessingActivity != null) {
            aiTextProcessingActivity.m16370f5();
        }
        c6951g.m30498c2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public static final void m30497a2(C6951G c6951g, View view) {
        C3034A c3034a = C3034A.f12453a;
        AbstractActivityC2592j abstractActivityC2592jM12211x1 = c6951g.m12211x1();
        AbstractC6118n.m27186d(abstractActivityC2592jM12211x1, "requireActivity(...)");
        c3034a.m15019F(abstractActivityC2592jM12211x1, AbstractC3041D.m15082g(c6951g.m30492V1()));
    }

    /* JADX INFO: renamed from: c2 */
    private final void m30498c2() {
        AbstractC5266I abstractC5266I = this.f27912p0;
        if (abstractC5266I == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5266I = null;
        }
        abstractC5266I.f20064B.setVisibility(0);
        abstractC5266I.f20065C.setVisibility(8);
        abstractC5266I.f20063A.setVisibility(8);
        AbstractC6672k.m28227d(AbstractC2658t.m12641a(this), null, null, new a(null), 3, null);
        this.f27913q0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0075  */
    /* JADX WARN: Code duplicated, block: B:21:0x007d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:47:0x010d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x010d -> B:48:0x010e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0116 -> B:17:0x006f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:41:0x00e3
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: e2 */
    public final java.lang.Object m30499e2(p173W5.InterfaceC1875e r18) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p347s1.C6951G.m30499e2(W5.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f2 */
    public static final List m30500f2(C6951G c6951g) {
        return AbstractC1638q.m6767l(c6951g.m12154X(R.string.analyzing_content), c6951g.m12154X(R.string.processing_data), c6951g.m12154X(R.string.applying_ai), c6951g.m12154X(R.string.generating_result), c6951g.m12154X(R.string.almost_done));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: C0 */
    public void mo676C0() {
        super.mo676C0();
        AbstractC5266I abstractC5266I = this.f27912p0;
        if (abstractC5266I == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5266I = null;
        }
        abstractC5266I.m10849k().getViewTreeObserver().removeOnGlobalLayoutListener(this.f27911o0);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: R0 */
    public void mo12080R0(Bundle outState) {
        AbstractC6118n.m27187e(outState, "outState");
        super.mo12080R0(outState);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: U0 */
    public void mo1869U0(View view, Bundle bundle) {
        AbstractC6118n.m27187e(view, "view");
        super.mo1869U0(view, bundle);
        m30495Y1();
        m30498c2();
    }

    /* JADX INFO: renamed from: b2 */
    public final void m30501b2(AbstractC7071b.a error) {
        AbstractC6118n.m27187e(error, "error");
        AbstractC5266I abstractC5266I = this.f27912p0;
        if (abstractC5266I == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5266I = null;
        }
        abstractC5266I.f20064B.setVisibility(8);
        abstractC5266I.f20065C.setVisibility(8);
        abstractC5266I.f20063A.setVisibility(0);
        abstractC5266I.f20066D.setText(error.m31175a());
        MaterialButton btnRetry = abstractC5266I.f20072w;
        AbstractC6118n.m27186d(btnRetry, "btnRetry");
        btnRetry.setVisibility(error.m31176b() ? 0 : 8);
        MaterialButton inAppPurchasing = abstractC5266I.f20074y;
        AbstractC6118n.m27186d(inAppPurchasing, "inAppPurchasing");
        inAppPurchasing.setVisibility(error.m31178d() && m30492V1().m15845V1() ? 0 : 8);
        MaterialButton btnUpdateApp = abstractC5266I.f20073x;
        AbstractC6118n.m27186d(btnUpdateApp, "btnUpdateApp");
        btnUpdateApp.setVisibility(error.m31177c() ? 0 : 8);
        this.f27913q0 = false;
    }

    /* JADX INFO: renamed from: d2 */
    public final void m30502d2(ProcessingResultData result, InterfaceC5367l function) {
        AbstractC6118n.m27187e(result, "result");
        AbstractC6118n.m27187e(function, "function");
        AbstractC5266I abstractC5266I = this.f27912p0;
        AbstractC5266I abstractC5266I2 = null;
        if (abstractC5266I == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5266I = null;
        }
        abstractC5266I.f20064B.setVisibility(8);
        abstractC5266I.f20065C.setVisibility(0);
        abstractC5266I.f20063A.setVisibility(8);
        TextInputEditText inputTextResult = abstractC5266I.f20075z;
        AbstractC6118n.m27186d(inputTextResult, "inputTextResult");
        inputTextResult.addTextChangedListener(new b(abstractC5266I, function));
        TextInputEditText textInputEditText = abstractC5266I.f20075z;
        String text = result.getText();
        if (text.length() == 0) {
            text = m12154X(R.string.empty_response);
            AbstractC6118n.m27186d(text, "getString(...)");
        }
        textInputEditText.setText(text);
        abstractC5266I.f20069G.setText(m12156Y(R.string.processing_time, String.valueOf(result.getProcessing_time())));
        AbstractC5266I abstractC5266I3 = this.f27912p0;
        if (abstractC5266I3 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5266I2 = abstractC5266I3;
        }
        abstractC5266I2.m10849k().getViewTreeObserver().addOnGlobalLayoutListener(this.f27911o0);
        this.f27913q0 = true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: z0 */
    public View mo682z0(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC6118n.m27187e(inflater, "inflater");
        AbstractC5266I abstractC5266IM24277u = AbstractC5266I.m24277u(inflater, viewGroup, false);
        this.f27912p0 = abstractC5266IM24277u;
        if (abstractC5266IM24277u == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5266IM24277u = null;
        }
        View viewM10849k = abstractC5266IM24277u.m10849k();
        AbstractC6118n.m27186d(viewM10849k, "getRoot(...)");
        return viewM10849k;
    }
}
