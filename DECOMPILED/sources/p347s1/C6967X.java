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
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.p222ai.AiTextProcessingActivity;
import com.anas_mugally.clipboard.p221ui.p222ai.models.AiPrompt;
import com.anas_mugally.clipboard.p221ui.p222ai.utils.C3135b;
import com.google.android.material.textfield.TextInputEditText;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p233e1.AbstractC5270M;
import p302m6.AbstractC6406h;

/* JADX INFO: renamed from: s1.X */
/* JADX INFO: loaded from: classes.dex */
public final class C6967X extends AbstractComponentCallbacksC2591i {

    /* JADX INFO: renamed from: v0 */
    public static final a f27957v0 = new a(null);

    /* JADX INFO: renamed from: o0 */
    private AbstractC5270M f27958o0;

    /* JADX INFO: renamed from: p0 */
    private boolean f27959p0;

    /* JADX INFO: renamed from: r0 */
    private String f27961r0;

    /* JADX INFO: renamed from: s0 */
    private String f27962s0;

    /* JADX INFO: renamed from: u0 */
    private boolean f27964u0;

    /* JADX INFO: renamed from: q0 */
    private final ViewTreeObserver.OnGlobalLayoutListener f27960q0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: s1.W
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            C6967X.m30550U1(this.f27956a);
        }
    };

    /* JADX INFO: renamed from: t0 */
    private final C3135b f27963t0 = new C3135b();

    /* JADX INFO: renamed from: s1.X$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C6967X m30556a(String text, String str) {
            AbstractC6118n.m27187e(text, "text");
            C6967X c6967x = new C6967X();
            Bundle bundle = new Bundle();
            bundle.putString("arg_text", text);
            if (str != null) {
                bundle.putString("arg_prompt_id", str);
            }
            c6967x.m12117E1(bundle);
            return c6967x;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: s1.X$b */
    public static final class b implements TextWatcher {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC5270M f27965a;

        public b(AbstractC5270M abstractC5270M) {
            this.f27965a = abstractC5270M;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Editable text = this.f27965a.f20098y.getText();
            if ((text != null ? text.length() : 0) <= 15) {
                this.f27965a.f20093A.setError(null);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    /* JADX INFO: renamed from: s1.X$c */
    public static final class c implements TextWatcher {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC5270M f27966a;

        public c(AbstractC5270M abstractC5270M) {
            this.f27966a = abstractC5270M;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Editable text = this.f27966a.f20097x.getText();
            if ((text != null ? text.length() : 0) <= 500) {
                this.f27966a.f20099z.setError(null);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    /* JADX INFO: renamed from: T1 */
    private final void m30549T1(boolean z7) {
        String string;
        String strValueOf;
        String string2;
        String string3;
        String string4;
        AbstractC5270M abstractC5270M = this.f27958o0;
        if (abstractC5270M == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5270M = null;
        }
        Editable text = abstractC5270M.f20098y.getText();
        String str = "";
        if (text == null || (string4 = text.toString()) == null || (string = AbstractC6406h.m27594S0(string4).toString()) == null) {
            string = "";
        }
        AbstractC5270M abstractC5270M2 = this.f27958o0;
        if (abstractC5270M2 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5270M2 = null;
        }
        Editable text2 = abstractC5270M2.f20097x.getText();
        if (text2 != null && (string2 = text2.toString()) != null && (string3 = AbstractC6406h.m27594S0(string2).toString()) != null) {
            str = string3;
        }
        if (m30555Z1(string, str, z7)) {
            AiPrompt aiPromptM16381g = this.f27963t0.m16381g(string, str);
            if (z7 || this.f27964u0) {
                C3135b c3135b = this.f27963t0;
                Context contextM12214y1 = m12214y1();
                AbstractC6118n.m27186d(contextM12214y1, "requireContext(...)");
                if (this.f27964u0) {
                    strValueOf = this.f27962s0;
                    AbstractC6118n.m27184b(strValueOf);
                } else {
                    strValueOf = String.valueOf(System.currentTimeMillis());
                }
                c3135b.m16376A(contextM12214y1, AiPrompt.copy$default(aiPromptM16381g, strValueOf, null, null, false, 0L, 30, null));
                if (z7 && this.f27964u0) {
                    m12211x1().mo12238b().m23939s();
                    return;
                }
            }
            AbstractActivityC2592j abstractActivityC2592jM12184m = m12184m();
            AbstractC6118n.m27185c(abstractActivityC2592jM12184m, "null cannot be cast to non-null type com.anas_mugally.clipboard.ui.ai.AiTextProcessingActivity");
            AiTextProcessingActivity.m16322b5((AiTextProcessingActivity) abstractActivityC2592jM12184m, aiPromptM16381g, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1 */
    public static final void m30550U1(C6967X c6967x) {
        int iM15016C;
        Rect rect = new Rect();
        AbstractC5270M abstractC5270M = c6967x.f27958o0;
        AbstractC5270M abstractC5270M2 = null;
        if (abstractC5270M == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5270M = null;
        }
        View viewM10849k = abstractC5270M.m10849k();
        AbstractC6118n.m27186d(viewM10849k, "getRoot(...)");
        viewM10849k.getWindowVisibleDisplayFrame(rect);
        int height = viewM10849k.getRootView().getHeight();
        boolean z7 = ((double) (height - rect.bottom)) > ((double) height) * 0.15d;
        if (z7 != c6967x.f27959p0) {
            c6967x.f27959p0 = z7;
            AbstractC5270M abstractC5270M3 = c6967x.f27958o0;
            if (abstractC5270M3 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5270M2 = abstractC5270M3;
            }
            ScrollView scroll = abstractC5270M2.f20094B;
            AbstractC6118n.m27186d(scroll, "scroll");
            ViewGroup.LayoutParams layoutParams = scroll.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (c6967x.f27959p0) {
                int iHeight = rect.height();
                C3034A c3034a = C3034A.f12453a;
                Context contextM12214y1 = c6967x.m12214y1();
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
            scroll.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: V1 */
    private final void m30551V1() {
        AbstractC5270M abstractC5270M;
        Object next;
        String str = this.f27962s0;
        if (str != null) {
            C3135b c3135b = this.f27963t0;
            Context contextM12214y1 = m12214y1();
            AbstractC6118n.m27186d(contextM12214y1, "requireContext(...)");
            Iterator it = c3135b.m16395u(contextM12214y1).iterator();
            do {
                abstractC5270M = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC6118n.m27183a(((AiPrompt) next).getId(), str));
            AiPrompt aiPrompt = (AiPrompt) next;
            if (aiPrompt != null) {
                AbstractC5270M abstractC5270M2 = this.f27958o0;
                if (abstractC5270M2 == null) {
                    AbstractC6118n.m27197o("binding");
                } else {
                    abstractC5270M = abstractC5270M2;
                }
                abstractC5270M.f20098y.setText(aiPrompt.getTitle());
                abstractC5270M.f20097x.setText(aiPrompt.getPrompt());
            }
        }
    }

    /* JADX INFO: renamed from: W1 */
    private final void m30552W1() {
        AbstractC5270M abstractC5270M = this.f27958o0;
        if (abstractC5270M == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5270M = null;
        }
        abstractC5270M.f20093A.setCounterMaxLength(15);
        abstractC5270M.f20093A.setCounterEnabled(true);
        abstractC5270M.f20099z.setCounterMaxLength(500);
        abstractC5270M.f20099z.setCounterEnabled(true);
        TextInputEditText inputTitle = abstractC5270M.f20098y;
        AbstractC6118n.m27186d(inputTitle, "inputTitle");
        inputTitle.addTextChangedListener(new b(abstractC5270M));
        TextInputEditText inputPrompt = abstractC5270M.f20097x;
        AbstractC6118n.m27186d(inputPrompt, "inputPrompt");
        inputPrompt.addTextChangedListener(new c(abstractC5270M));
        abstractC5270M.f20095v.setOnClickListener(new View.OnClickListener() { // from class: s1.U
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6967X.m30553X1(this.f27954a, view);
            }
        });
        abstractC5270M.f20096w.setOnClickListener(new View.OnClickListener() { // from class: s1.V
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6967X.m30554Y1(this.f27955a, view);
            }
        });
        if (this.f27964u0) {
            abstractC5270M.f20096w.setText(m12154X(R.string.only_update));
            abstractC5270M.f20095v.setText(m12154X(R.string.update_and_execute));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public static final void m30553X1(C6967X c6967x, View view) {
        c6967x.m30549T1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public static final void m30554Y1(C6967X c6967x, View view) {
        c6967x.m30549T1(true);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX INFO: renamed from: Z1 */
    private final boolean m30555Z1(String str, String str2, boolean z7) {
        boolean z8;
        AbstractC5270M abstractC5270M = this.f27958o0;
        if (abstractC5270M == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5270M = null;
        }
        if (str2.length() == 0) {
            abstractC5270M.f20099z.setError(m12154X(R.string.prompt_required));
        } else {
            if (str2.length() <= 500) {
                if (str2.length() < 25) {
                    abstractC5270M.f20099z.setError(m12156Y(R.string.prompt_too_short, "25"));
                } else {
                    abstractC5270M.f20099z.setError(null);
                    z8 = true;
                }
                if (z7 && !this.f27964u0) {
                    abstractC5270M.f20093A.setError(null);
                    return z8;
                }
                if (str.length() == 0) {
                    abstractC5270M.f20093A.setError(m12154X(R.string.title_required_for_save));
                    abstractC5270M.f20094B.scrollTo(0, 0);
                    return false;
                }
                if (str.length() > 15) {
                    abstractC5270M.f20093A.setError(null);
                    return z8;
                }
                abstractC5270M.f20094B.scrollTo(0, 0);
                abstractC5270M.f20093A.setError(m12156Y(R.string.title_too_long, "15"));
                return false;
            }
            abstractC5270M.f20099z.setError(m12156Y(R.string.prompt_too_long, "500"));
        }
        z8 = false;
        if (z7) {
        }
        if (str.length() == 0) {
            abstractC5270M.f20093A.setError(m12154X(R.string.title_required_for_save));
            abstractC5270M.f20094B.scrollTo(0, 0);
            return false;
        }
        if (str.length() > 15) {
            abstractC5270M.f20093A.setError(null);
            return z8;
        }
        abstractC5270M.f20094B.scrollTo(0, 0);
        abstractC5270M.f20093A.setError(m12156Y(R.string.title_too_long, "15"));
        return false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: C0 */
    public void mo676C0() {
        super.mo676C0();
        AbstractC5270M abstractC5270M = this.f27958o0;
        if (abstractC5270M == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5270M = null;
        }
        abstractC5270M.m10849k().getViewTreeObserver().removeOnGlobalLayoutListener(this.f27960q0);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: U0 */
    public void mo1869U0(View view, Bundle bundle) {
        String string;
        AbstractC6118n.m27187e(view, "view");
        super.mo1869U0(view, bundle);
        Bundle bundleM12199s = m12199s();
        if (bundleM12199s == null || (string = bundleM12199s.getString("arg_text")) == null) {
            string = "";
        }
        this.f27961r0 = string;
        Bundle bundleM12199s2 = m12199s();
        String string2 = bundleM12199s2 != null ? bundleM12199s2.getString("arg_prompt_id") : null;
        this.f27962s0 = string2;
        this.f27964u0 = string2 != null;
        m30552W1();
        m30551V1();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: z0 */
    public View mo682z0(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC6118n.m27187e(inflater, "inflater");
        AbstractC5270M abstractC5270MM24283u = AbstractC5270M.m24283u(inflater, viewGroup, false);
        this.f27958o0 = abstractC5270MM24283u;
        if (abstractC5270MM24283u == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5270MM24283u = null;
        }
        View viewM10849k = abstractC5270MM24283u.m10849k();
        AbstractC6118n.m27186d(viewM10849k, "getRoot(...)");
        return viewM10849k;
    }
}
