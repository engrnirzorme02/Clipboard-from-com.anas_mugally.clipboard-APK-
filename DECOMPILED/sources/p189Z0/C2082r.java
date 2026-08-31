package p189Z0;

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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC2473f;
import androidx.recyclerview.widget.RecyclerView;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.ActionsLayout;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.SearchActivity;
import com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a;
import com.anas_mugally.clipboard.p221ui.notes.BrowserNotesFullActivity;
import java.util.List;
import kotlin.jvm.internal.AbstractC6104G;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1430h;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p225d1.C5211c;
import p233e1.AbstractC5318r0;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5371p;
import p238e6.InterfaceC5373r;

/* JADX INFO: renamed from: Z0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2082r extends AbstractC2072h {

    /* JADX INFO: renamed from: t */
    public static final a f6860t = new a(null);

    /* JADX INFO: renamed from: p */
    private final InterfaceC1429g f6861p;

    /* JADX INFO: renamed from: q */
    private final InterfaceC1429g f6862q;

    /* JADX INFO: renamed from: r */
    private final InterfaceC1429g f6863r;

    /* JADX INFO: renamed from: s */
    private final int f6864s;

    /* JADX INFO: renamed from: Z0.r$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: Z0.r$b */
    public final class b extends RecyclerView.AbstractC2749E {

        /* JADX INFO: renamed from: u */
        private AbstractC5318r0 f6865u;

        /* JADX INFO: renamed from: v */
        final /* synthetic */ C2082r f6866v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2082r c2082r, View view) {
            super(view);
            AbstractC6118n.m27187e(view, "view");
            this.f6866v = c2082r;
            AbstractC5318r0 abstractC5318r0 = (AbstractC5318r0) AbstractC2473f.m10822a(view);
            if (c2082r.m8585e0()) {
                AbstractC6118n.m27184b(abstractC5318r0);
                abstractC5318r0.f20345w.setVisibility(8);
            }
            this.f6865u = abstractC5318r0;
        }

        /* JADX INFO: renamed from: Q */
        public final AbstractC5318r0 m8594Q() {
            return this.f6865u;
        }
    }

    /* JADX INFO: renamed from: Z0.r$c */
    public static final class c extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TextView f6868b;

        c(TextView textView) {
            this.f6868b = textView;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC6118n.m27187e(widget, "widget");
            Object objM8542F = C2082r.this.m8542F();
            AbstractC6118n.m27185c(objM8542F, "null cannot be cast to non-null type android.view.View.OnClickListener");
            ((View.OnClickListener) objM8542F).onClick(this.f6868b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2082r(final Context context, boolean z7) {
        super(context, z7);
        AbstractC6118n.m27187e(context, "context");
        this.f6861p = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: Z0.l
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return Boolean.valueOf(C2082r.m8589i0());
            }
        });
        this.f6862q = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: Z0.m
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return Boolean.valueOf(C2082r.m8588h0(context, this));
            }
        });
        this.f6863r = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: Z0.n
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return Boolean.valueOf(C2082r.m8586f0(context));
            }
        });
        this.f6864s = 250;
    }

    /* JADX INFO: renamed from: Z */
    private final void m8580Z(final AbstractC5318r0 abstractC5318r0, final int i7, int i8, final C5211c c5211c) {
        if (m8567N()) {
            abstractC5318r0.f20347y.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Z0.o
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                    C2082r.m8581a0(this.f6852a, c5211c, compoundButton, z7);
                }
            });
            abstractC5318r0.f20347y.setChecked(m8566M().contains(Integer.valueOf(c5211c.m24110d())));
            abstractC5318r0.f20347y.setVisibility(0);
            abstractC5318r0.f20345w.setVisibility(4);
            abstractC5318r0.f20344v.setVisibility(8);
        } else {
            abstractC5318r0.f20347y.setVisibility(8);
            abstractC5318r0.f20345w.setVisibility(0);
            abstractC5318r0.f20344v.setVisibility(0);
        }
        View.OnClickListener onClickListener = m8567N() ? new View.OnClickListener() { // from class: Z0.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2082r.m8582b0(abstractC5318r0, this, i7, view);
            }
        } : null;
        abstractC5318r0.f20346x.setOnClickListener(onClickListener);
        abstractC5318r0.f20348z.setOnClickListener(onClickListener);
        abstractC5318r0.f20342A.setOnClickListener(onClickListener);
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: Z0.q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return C2082r.m8583c0(this.f6857a, c5211c, i7, view);
            }
        };
        abstractC5318r0.f20346x.setOnLongClickListener(onLongClickListener);
        abstractC5318r0.f20348z.setOnLongClickListener(onLongClickListener);
        abstractC5318r0.f20342A.setOnLongClickListener(onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final void m8581a0(C2082r c2082r, C5211c c5211c, CompoundButton compoundButton, boolean z7) {
        AbstractC6118n.m27187e(compoundButton, "<unused var>");
        if (z7) {
            c2082r.m8566M().add(Integer.valueOf(c5211c.m24110d()));
        } else {
            c2082r.m8566M().remove(Integer.valueOf(c5211c.m24110d()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final void m8582b0(AbstractC5318r0 abstractC5318r0, C2082r c2082r, int i7, View view) {
        abstractC5318r0.f20347y.toggle();
        c2082r.m13323m(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final boolean m8583c0(C2082r c2082r, C5211c c5211c, int i7, View view) {
        if (!c2082r.m8567N()) {
            Object objM8542F = c2082r.m8542F();
            AbstractC6118n.m27185c(objM8542F, "null cannot be cast to non-null type com.anas_mugally.clipboard.adapters.MutableSelectAdapter.OnMenuChangeListener");
            ((AbstractC2072h.a) objM8542F).mo8569C(c2082r);
            c2082r.m8568O(true);
        }
        c2082r.m8566M().add(Integer.valueOf(c5211c.m24110d()));
        c2082r.m13323m(i7);
        return true;
    }

    /* JADX INFO: renamed from: d0 */
    private final boolean m8584d0() {
        return ((Boolean) this.f6861p.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public final boolean m8585e0() {
        return ((Boolean) this.f6863r.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final boolean m8586f0(Context context) {
        return context instanceof SearchActivity;
    }

    /* JADX INFO: renamed from: g0 */
    private final boolean m8587g0() {
        return ((Boolean) this.f6862q.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final boolean m8588h0(Context context, C2082r c2082r) {
        return (context instanceof BrowserNotesFullActivity) || c2082r.m8584d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final boolean m8589i0() {
        return Build.VERSION.SDK_INT < 28;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final void m8590j0(C2082r c2082r, int i7, int i8, View view) {
        Context contextM8542F = c2082r.m8542F();
        AbstractC6118n.m27185c(contextM8542F, "null cannot be cast to non-null type kotlin.Function4<android.view.View?, kotlin.Int, kotlin.Int, kotlin.String?, kotlin.Unit>");
        ((InterfaceC5373r) AbstractC6104G.m27161d(contextM8542F, 4)).mo1284y(null, Integer.valueOf(i7), Integer.valueOf(view.getId()), null);
        c2082r.m13323m(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final boolean m8591k0(C2082r c2082r, AbstractC5318r0 abstractC5318r0, int i7, MenuItem item) {
        AbstractC6118n.m27187e(item, "item");
        Context contextM8542F = c2082r.m8542F();
        AbstractC6118n.m27185c(contextM8542F, "null cannot be cast to non-null type kotlin.Function4<android.view.View?, kotlin.Int, kotlin.Int, kotlin.String?, kotlin.Unit>");
        ((InterfaceC5373r) AbstractC6104G.m27161d(contextM8542F, 4)).mo1284y(abstractC5318r0.f20344v.getItemViewMap().get(Integer.valueOf(item.getItemId())), Integer.valueOf(i7), Integer.valueOf(item.getItemId()), null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C1444v m8592l0(C2082r c2082r, C5211c c5211c, ComponentName componentName, ActionsLayout.EnumC3037c type) {
        AbstractC6118n.m27187e(type, "type");
        Context contextM8542F = c2082r.m8542F();
        AbstractC6118n.m27185c(contextM8542F, "null cannot be cast to non-null type com.anas_mugally.clipboard.ui.ads.BaseAdsActivity");
        AbstractC3041D.m15090o((AbstractActivityC3130a) contextM8542F, c5211c.m24112f(), componentName, type, false, 8, null);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: m0 */
    private final void m8593m0(TextView textView, String str) {
        if (str.length() <= this.f6864s) {
            textView.setText(str);
            return;
        }
        String str2 = ' ' + m8542F().getString(R.string.show_more);
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, this.f6864s - str2.length());
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

    @Override // p189Z0.AbstractC2066b, androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: q */
    public void mo3682q(RecyclerView.AbstractC2749E holder, final int i7) {
        AbstractC6118n.m27187e(holder, "holder");
        final int iM8543G = m8543G(i7);
        if (holder instanceof b) {
            final AbstractC5318r0 abstractC5318r0M8594Q = ((b) holder).m8594Q();
            AbstractC6118n.m27184b(abstractC5318r0M8594Q);
            List listM8541E = m8541E();
            final C5211c c5211c = listM8541E != null ? (C5211c) listM8541E.get(iM8543G) : null;
            AbstractC6118n.m27184b(c5211c);
            abstractC5318r0M8594Q.f20342A.setText(c5211c.m24113g());
            TextView textContent = abstractC5318r0M8594Q.f20348z;
            AbstractC6118n.m27186d(textContent, "textContent");
            m8593m0(textContent, c5211c.m24112f());
            abstractC5318r0M8594Q.f20345w.setImageResource(c5211c.m24111e() != 0 ? R.drawable.ic_pin : R.drawable.ic_unpin);
            abstractC5318r0M8594Q.f20345w.setOnClickListener(new View.OnClickListener() { // from class: Z0.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2082r.m8590j0(this.f6841a, iM8543G, i7, view);
                }
            });
            abstractC5318r0M8594Q.f20344v.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: Z0.j
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return C2082r.m8591k0(this.f6844a, abstractC5318r0M8594Q, iM8543G, menuItem);
                }
            });
            abstractC5318r0M8594Q.f20344v.setOnMoreAppsItemClickListener(new InterfaceC5371p() { // from class: Z0.k
                @Override // p238e6.InterfaceC5371p
                public final Object invoke(Object obj, Object obj2) {
                    return C2082r.m8592l0(this.f6847a, c5211c, (ComponentName) obj, (ActionsLayout.EnumC3037c) obj2);
                }
            });
            if (m8587g0()) {
                abstractC5318r0M8594Q.f20344v.removeItem(R.id.send_text);
            }
            if (!m8585e0()) {
                m8580Z(abstractC5318r0M8594Q, i7, iM8543G, c5211c);
            }
            abstractC5318r0M8594Q.f20342A.setTag(Integer.valueOf(iM8543G));
            abstractC5318r0M8594Q.f20348z.setTag(Integer.valueOf(iM8543G));
            abstractC5318r0M8594Q.f20346x.setTag(Integer.valueOf(iM8543G));
            if (!m8567N()) {
                TextView textView = abstractC5318r0M8594Q.f20342A;
                Object objM8542F = m8542F();
                AbstractC6118n.m27185c(objM8542F, "null cannot be cast to non-null type android.view.View.OnClickListener");
                textView.setOnClickListener((View.OnClickListener) objM8542F);
                TextView textView2 = abstractC5318r0M8594Q.f20348z;
                Object objM8542F2 = m8542F();
                AbstractC6118n.m27185c(objM8542F2, "null cannot be cast to non-null type android.view.View.OnClickListener");
                textView2.setOnClickListener((View.OnClickListener) objM8542F2);
                ConstraintLayout constraintLayout = abstractC5318r0M8594Q.f20346x;
                Object objM8542F3 = m8542F();
                AbstractC6118n.m27185c(objM8542F3, "null cannot be cast to non-null type android.view.View.OnClickListener");
                constraintLayout.setOnClickListener((View.OnClickListener) objM8542F3);
            }
        } else {
            super.mo3682q(holder, iM8543G);
        }
        if (i7 == mo8548g() - 1) {
            View itemView = holder.f10894a;
            AbstractC6118n.m27186d(itemView, "itemView");
            itemView.setPadding(itemView.getPaddingLeft(), itemView.getPaddingTop(), itemView.getPaddingRight(), 500);
        } else if (holder.f10894a.getPaddingBottom() == 500) {
            View itemView2 = holder.f10894a;
            AbstractC6118n.m27186d(itemView2, "itemView");
            itemView2.setPadding(itemView2.getPaddingLeft(), itemView2.getPaddingTop(), itemView2.getPaddingRight(), 0);
        }
    }

    @Override // p189Z0.AbstractC2066b, androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: s */
    public RecyclerView.AbstractC2749E mo3683s(ViewGroup parent, int i7) {
        AbstractC6118n.m27187e(parent, "parent");
        if (i7 != m8544H()) {
            return super.mo3683s(parent, i7);
        }
        View viewInflate = LayoutInflater.from(m8542F()).inflate(R.layout.view_symbol_note, parent, false);
        AbstractC6118n.m27186d(viewInflate, "inflate(...)");
        return new b(this, viewInflate);
    }
}
