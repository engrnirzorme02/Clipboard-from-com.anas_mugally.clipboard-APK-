package p395y1;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.databinding.AbstractC2473f;
import androidx.recyclerview.widget.RecyclerView;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.ActionsLayout;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a;
import com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a;
import com.anas_mugally.clipboard.p221ui.temporaryNotes.BrowserTemporaryTextActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6104G;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1430h;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p189Z0.AbstractC2071g;
import p189Z0.AbstractC2072h;
import p225d1.C5210b;
import p233e1.AbstractC5322t0;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5371p;
import p238e6.InterfaceC5373r;

/* JADX INFO: renamed from: y1.H */
/* JADX INFO: loaded from: classes.dex */
public final class C7478H extends AbstractC2071g {

    /* JADX INFO: renamed from: A */
    public static final a f30020A = new a(null);

    /* JADX INFO: renamed from: s */
    private boolean f30021s;

    /* JADX INFO: renamed from: t */
    private final InterfaceC1429g f30022t;

    /* JADX INFO: renamed from: u */
    private final InterfaceC1429g f30023u;

    /* JADX INFO: renamed from: v */
    private final int f30024v;

    /* JADX INFO: renamed from: w */
    private final int f30025w;

    /* JADX INFO: renamed from: x */
    private final float f30026x;

    /* JADX INFO: renamed from: y */
    private int f30027y;

    /* JADX INFO: renamed from: z */
    private final SimpleDateFormat f30028z;

    /* JADX INFO: renamed from: y1.H$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: y1.H$b */
    public final class b extends RecyclerView.AbstractC2749E {

        /* JADX INFO: renamed from: u */
        private AbstractC5322t0 f30029u;

        /* JADX INFO: renamed from: v */
        final /* synthetic */ C7478H f30030v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C7478H c7478h, View view) {
            super(view);
            AbstractC6118n.m27187e(view, "view");
            this.f30030v = c7478h;
            this.f30029u = (AbstractC5322t0) AbstractC2473f.m10822a(view);
        }

        /* JADX INFO: renamed from: Q */
        public final AbstractC5322t0 m33121Q() {
            return this.f30029u;
        }
    }

    /* JADX INFO: renamed from: y1.H$c */
    public static final class c extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TextView f30032b;

        c(TextView textView) {
            this.f30032b = textView;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC6118n.m27187e(widget, "widget");
            Object objM8542F = C7478H.this.m8542F();
            AbstractC6118n.m27185c(objM8542F, "null cannot be cast to non-null type android.view.View.OnClickListener");
            ((View.OnClickListener) objM8542F).onClick(this.f30032b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7478H(final BrowserTemporaryTextActivity activity, boolean z7) {
        super(activity, z7);
        AbstractC6118n.m27187e(activity, "activity");
        this.f30022t = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: y1.A
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return Boolean.valueOf(C7478H.m33108n0());
            }
        });
        this.f30023u = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: y1.B
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return Boolean.valueOf(C7478H.m33107m0(this.f30004a, activity));
            }
        });
        this.f30024v = 300;
        this.f30025w = 25;
        this.f30026x = 0.5f;
        this.f30027y = -1;
        this.f30028z = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", Locale.getDefault());
    }

    /* JADX INFO: renamed from: d0 */
    private final void m33100d0(final AbstractC5322t0 abstractC5322t0, final int i7, final int i8, final C5210b c5210b, final boolean z7) {
        View.OnClickListener onClickListener;
        if (m8567N()) {
            if (z7) {
                abstractC5322t0.f20373x.setVisibility(8);
            } else {
                abstractC5322t0.f20373x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: y1.D
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                        C7478H.m33103g0(this.f30008a, c5210b, compoundButton, z8);
                    }
                });
                abstractC5322t0.f20373x.setChecked(m8566M().contains(Integer.valueOf(c5210b.m24104a())));
                abstractC5322t0.f20373x.setVisibility(0);
            }
            abstractC5322t0.f20371v.setVisibility(8);
        } else {
            abstractC5322t0.f20373x.setVisibility(8);
            abstractC5322t0.f20371v.setVisibility(0);
        }
        if (m8567N()) {
            onClickListener = z7 ? new View.OnClickListener() { // from class: y1.E
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7478H.m33104h0(this.f30010a, i8, view);
                }
            } : new View.OnClickListener() { // from class: y1.F
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7478H.m33101e0(abstractC5322t0, this, i7, view);
                }
            };
        } else {
            onClickListener = null;
        }
        abstractC5322t0.f20372w.setOnClickListener(onClickListener);
        abstractC5322t0.f20374y.setOnClickListener(onClickListener);
        abstractC5322t0.f20375z.setOnClickListener(onClickListener);
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: y1.G
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return C7478H.m33102f0(z7, this, i8, c5210b, i7, view);
            }
        };
        abstractC5322t0.f20372w.setOnLongClickListener(onLongClickListener);
        abstractC5322t0.f20374y.setOnLongClickListener(onLongClickListener);
        abstractC5322t0.f20375z.setOnLongClickListener(onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final void m33101e0(AbstractC5322t0 abstractC5322t0, C7478H c7478h, int i7, View view) {
        abstractC5322t0.f20373x.toggle();
        c7478h.m13323m(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final boolean m33102f0(boolean z7, C7478H c7478h, int i7, C5210b c5210b, int i8, View view) {
        if (z7) {
            AbstractC6118n.m27184b(view);
            c7478h.m33116x0(view, i7);
        } else {
            if (!c7478h.m8567N()) {
                Object objM8542F = c7478h.m8542F();
                AbstractC6118n.m27185c(objM8542F, "null cannot be cast to non-null type com.anas_mugally.clipboard.adapters.MutableSelectAdapter.OnMenuChangeListener");
                ((AbstractC2072h.a) objM8542F).mo8569C(c7478h);
                c7478h.m8568O(true);
            }
            c7478h.m8566M().add(Integer.valueOf(c5210b.m24104a()));
            c7478h.m13323m(i8);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final void m33103g0(C7478H c7478h, C5210b c5210b, CompoundButton compoundButton, boolean z7) {
        AbstractC6118n.m27187e(compoundButton, "<unused var>");
        if (z7) {
            c7478h.m8566M().add(Integer.valueOf(c5210b.m24104a()));
        } else {
            c7478h.m8566M().remove(Integer.valueOf(c5210b.m24104a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final void m33104h0(C7478H c7478h, int i7, View view) {
        AbstractC6118n.m27184b(view);
        c7478h.m33116x0(view, i7);
    }

    /* JADX INFO: renamed from: k0 */
    private final boolean m33105k0() {
        return ((Boolean) this.f30022t.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l0 */
    private final boolean m33106l0() {
        return ((Boolean) this.f30023u.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final boolean m33107m0(C7478H c7478h, BrowserTemporaryTextActivity browserTemporaryTextActivity) {
        return c7478h.m33105k0() || browserTemporaryTextActivity.m16711P4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final boolean m33108n0() {
        return Build.VERSION.SDK_INT < 28;
    }

    /* JADX INFO: renamed from: q0 */
    private final void m33109q0(TextView textView, String str) {
        if (str.length() > this.f30025w) {
            StringBuilder sb = new StringBuilder();
            String strSubstring = str.substring(0, this.f30025w);
            AbstractC6118n.m27186d(strSubstring, "substring(...)");
            sb.append(strSubstring);
            sb.append((char) 8230);
            str = sb.toString();
        }
        textView.setText(str);
        textView.setMovementMethod(null);
    }

    /* JADX INFO: renamed from: r0 */
    private final void m33110r0(TextView textView, String str) {
        if (str.length() <= this.f30024v) {
            textView.setText(str);
            return;
        }
        String str2 = ' ' + m8542F().getString(R.string.show_more);
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, this.f30024v - str2.length());
        AbstractC6118n.m27186d(strSubstring, "substring(...)");
        sb.append(strSubstring);
        sb.append((char) 8230);
        String str3 = sb.toString() + str2;
        SpannableString spannableString = new SpannableString(str3);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FF03DAC5")), str3.length() - str2.length(), str3.length(), 33);
        spannableString.setSpan(new c(textView), str3.length() - str2.length(), str3.length(), 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: s0 */
    private final void m33111s0(final ActionsLayout actionsLayout, final int i7, final C5210b c5210b, final boolean z7) {
        if ((actionsLayout != null ? actionsLayout : null) != null) {
            actionsLayout.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: y1.y
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return C7478H.m33112t0(z7, this, actionsLayout, i7, menuItem);
                }
            });
            actionsLayout.setOnMoreAppsItemClickListener(new InterfaceC5371p() { // from class: y1.z
                @Override // p238e6.InterfaceC5371p
                public final Object invoke(Object obj, Object obj2) {
                    return C7478H.m33113u0(z7, this, actionsLayout, i7, c5210b, (ComponentName) obj, (ActionsLayout.EnumC3037c) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final boolean m33112t0(boolean z7, C7478H c7478h, ActionsLayout actionsLayout, int i7, MenuItem item) {
        AbstractC6118n.m27187e(item, "item");
        if (z7) {
            c7478h.m33116x0(actionsLayout, i7);
            return true;
        }
        Context contextM8542F = c7478h.m8542F();
        AbstractC6118n.m27185c(contextM8542F, "null cannot be cast to non-null type kotlin.Function4<android.view.View?, kotlin.Int, kotlin.Int, kotlin.String?, kotlin.Unit>");
        ((InterfaceC5373r) AbstractC6104G.m27161d(contextM8542F, 4)).mo1284y(actionsLayout.getItemViewMap().get(Integer.valueOf(item.getItemId())), Integer.valueOf(i7), Integer.valueOf(item.getItemId()), null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C1444v m33113u0(boolean z7, C7478H c7478h, ActionsLayout actionsLayout, int i7, C5210b c5210b, ComponentName componentName, ActionsLayout.EnumC3037c type) {
        AbstractC6118n.m27187e(type, "type");
        if (z7) {
            c7478h.m33116x0(actionsLayout, i7);
        } else {
            Context contextM8542F = c7478h.m8542F();
            AbstractC6118n.m27185c(contextM8542F, "null cannot be cast to non-null type com.anas_mugally.clipboard.ui.ads.BaseAdsActivity");
            AbstractC3041D.m15090o((AbstractActivityC3130a) contextM8542F, c5210b.m24105b(), componentName, type, false, 8, null);
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: v0 */
    private final void m33114v0(AbstractC5322t0 abstractC5322t0, final int i7, boolean z7) {
        View.OnClickListener onClickListener;
        abstractC5322t0.f20375z.setTag(Integer.valueOf(i7));
        abstractC5322t0.f20374y.setTag(Integer.valueOf(i7));
        abstractC5322t0.f20372w.setTag(Integer.valueOf(i7));
        if (z7) {
            onClickListener = new View.OnClickListener() { // from class: y1.C
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7478H.m33115w0(this.f30006a, i7, view);
                }
            };
        } else {
            Object objM8542F = m8542F();
            AbstractC6118n.m27185c(objM8542F, "null cannot be cast to non-null type android.view.View.OnClickListener");
            onClickListener = (View.OnClickListener) objM8542F;
        }
        if (m8567N()) {
            return;
        }
        abstractC5322t0.f20375z.setOnClickListener(onClickListener);
        abstractC5322t0.f20374y.setOnClickListener(onClickListener);
        abstractC5322t0.f20372w.setOnClickListener(onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m33115w0(C7478H c7478h, int i7, View view) {
        AbstractC6118n.m27184b(view);
        c7478h.m33116x0(view, i7);
    }

    /* JADX INFO: renamed from: x0 */
    private final void m33116x0(View view, int i7) {
        this.f30027y = i7;
        Context contextM8542F = m8542F();
        AbstractC6118n.m27185c(contextM8542F, "null cannot be cast to non-null type com.anas_mugally.clipboard.ui.BaseBillingActivity");
        ((AbstractViewOnClickListenerC3111a) contextM8542F).onClick(view);
    }

    /* JADX INFO: renamed from: i0 */
    public final int m33117i0() {
        return this.f30027y;
    }

    /* JADX INFO: renamed from: j0 */
    public final int m33118j0() {
        return this.f30021s ? 0 : 250;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m33119o0(int i7) {
        this.f30027y = i7;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m33120p0(boolean z7) {
        this.f30021s = z7;
    }

    @Override // p189Z0.AbstractC2071g, p189Z0.AbstractC2066b, androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: q */
    public void mo3682q(RecyclerView.AbstractC2749E holder, int i7) {
        int i8;
        AbstractC6118n.m27187e(holder, "holder");
        int iM8543G = m8543G(i7);
        if (holder instanceof b) {
            AbstractC5322t0 abstractC5322t0M33121Q = ((b) holder).m33121Q();
            AbstractC6118n.m27184b(abstractC5322t0M33121Q);
            List listM8541E = m8541E();
            C5210b c5210b = listM8541E != null ? (C5210b) listM8541E.get(iM8543G) : null;
            AbstractC6118n.m27184b(c5210b);
            boolean z7 = m8545I() && iM8543G >= m33118j0();
            abstractC5322t0M33121Q.f20375z.setText(this.f30028z.format(new Date(c5210b.m24106c())));
            if (z7) {
                TextView textContent = abstractC5322t0M33121Q.f20374y;
                AbstractC6118n.m27186d(textContent, "textContent");
                m33109q0(textContent, c5210b.m24105b());
                abstractC5322t0M33121Q.m10849k().setAlpha(this.f30026x);
            } else {
                TextView textContent2 = abstractC5322t0M33121Q.f20374y;
                AbstractC6118n.m27186d(textContent2, "textContent");
                m33110r0(textContent2, c5210b.m24105b());
                abstractC5322t0M33121Q.m10849k().setAlpha(1.0f);
            }
            ActionsLayout actions = abstractC5322t0M33121Q.f20371v;
            AbstractC6118n.m27186d(actions, "actions");
            m33111s0(actions, iM8543G, c5210b, z7);
            if (m33106l0()) {
                abstractC5322t0M33121Q.f20371v.removeItem(R.id.send_text);
            }
            i8 = i7;
            m33100d0(abstractC5322t0M33121Q, i8, iM8543G, c5210b, z7);
            m33114v0(abstractC5322t0M33121Q, iM8543G, z7);
        } else {
            i8 = i7;
            super.mo3682q(holder, iM8543G);
        }
        if (i8 == mo8548g() - 1) {
            View itemView = holder.f10894a;
            AbstractC6118n.m27186d(itemView, "itemView");
            itemView.setPadding(itemView.getPaddingLeft(), itemView.getPaddingTop(), itemView.getPaddingRight(), 500);
        } else if (holder.f10894a.getPaddingBottom() == 500) {
            View itemView2 = holder.f10894a;
            AbstractC6118n.m27186d(itemView2, "itemView");
            itemView2.setPadding(itemView2.getPaddingLeft(), itemView2.getPaddingTop(), itemView2.getPaddingRight(), 0);
        }
    }

    @Override // p189Z0.AbstractC2071g, p189Z0.AbstractC2066b, androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: s */
    public RecyclerView.AbstractC2749E mo3683s(ViewGroup parent, int i7) {
        AbstractC6118n.m27187e(parent, "parent");
        if (i7 != m8544H()) {
            return super.mo3683s(parent, i7);
        }
        View viewInflate = LayoutInflater.from(m8542F()).inflate(R.layout.view_symbol_temporary_note, parent, false);
        AbstractC6118n.m27186d(viewInflate, "inflate(...)");
        return new b(this, viewInflate);
    }
}
