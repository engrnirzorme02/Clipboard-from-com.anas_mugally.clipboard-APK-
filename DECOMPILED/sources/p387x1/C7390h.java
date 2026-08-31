package p387x1;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import androidx.databinding.AbstractC2473f;
import androidx.recyclerview.widget.RecyclerView;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.ActionsLayout;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a;
import java.util.List;
import kotlin.jvm.internal.AbstractC6104G;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1430h;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p189Z0.AbstractC2072h;
import p233e1.AbstractC5314p0;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5371p;
import p238e6.InterfaceC5372q;

/* JADX INFO: renamed from: x1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7390h extends AbstractC2072h {

    /* JADX INFO: renamed from: p */
    private final InterfaceC1429g f29621p;

    /* JADX INFO: renamed from: q */
    private final InterfaceC1429g f29622q;

    /* JADX INFO: renamed from: x1.h$a */
    public final class a extends RecyclerView.AbstractC2749E {

        /* JADX INFO: renamed from: u */
        private AbstractC5314p0 f29623u;

        /* JADX INFO: renamed from: v */
        final /* synthetic */ C7390h f29624v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7390h c7390h, View view) {
            super(view);
            AbstractC6118n.m27187e(view, "view");
            this.f29624v = c7390h;
            this.f29623u = (AbstractC5314p0) AbstractC2473f.m10822a(view);
        }

        /* JADX INFO: renamed from: Q */
        public final AbstractC5314p0 m32724Q() {
            return this.f29623u;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7390h(Context context, boolean z7) {
        super(context, z7);
        AbstractC6118n.m27187e(context, "context");
        this.f29621p = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: x1.a
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return Boolean.valueOf(C7390h.m32717Z());
            }
        });
        this.f29622q = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: x1.b
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return Boolean.valueOf(C7390h.m32716Y(this.f29607a));
            }
        });
    }

    /* JADX INFO: renamed from: W */
    private final boolean m32714W() {
        return ((Boolean) this.f29621p.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: X */
    private final boolean m32715X() {
        return ((Boolean) this.f29622q.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final boolean m32716Y(C7390h c7390h) {
        return c7390h.m32714W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final boolean m32717Z() {
        return Build.VERSION.SDK_INT < 28;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final boolean m32718a0(C7390h c7390h, AbstractC5314p0 abstractC5314p0, String str, MenuItem item) {
        AbstractC6118n.m27187e(item, "item");
        int itemId = item.getItemId();
        Context contextM8542F = c7390h.m8542F();
        AbstractC6118n.m27185c(contextM8542F, "null cannot be cast to non-null type kotlin.Function3<android.view.View?, kotlin.Int, kotlin.String?, kotlin.Unit>");
        InterfaceC5372q interfaceC5372q = (InterfaceC5372q) AbstractC6104G.m27161d(contextM8542F, 3);
        ImageButton imageButton = abstractC5314p0.f20318v.getItemViewMap().get(Integer.valueOf(itemId));
        AbstractC6118n.m27184b(imageButton);
        interfaceC5372q.mo7830j(imageButton, Integer.valueOf(itemId), str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C1444v m32719b0(C7390h c7390h, String str, ComponentName componentName, ActionsLayout.EnumC3037c type) {
        AbstractC6118n.m27187e(type, "type");
        Context contextM8542F = c7390h.m8542F();
        AbstractC6118n.m27185c(contextM8542F, "null cannot be cast to non-null type com.anas_mugally.clipboard.ui.ads.BaseAdsActivity");
        AbstractC3041D.m15090o((AbstractActivityC3130a) contextM8542F, str, componentName, type, false, 8, null);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: c0 */
    private final void m32720c0(final AbstractC5314p0 abstractC5314p0, final int i7, final int i8) {
        if (m8567N()) {
            abstractC5314p0.f20320x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: x1.e
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                    C7390h.m32721d0(this.f29613a, i8, compoundButton, z7);
                }
            });
            abstractC5314p0.f20320x.setChecked(m8566M().contains(Integer.valueOf(i8)));
            abstractC5314p0.f20320x.setVisibility(0);
            abstractC5314p0.f20318v.setVisibility(8);
        } else {
            abstractC5314p0.f20320x.setVisibility(8);
            abstractC5314p0.f20318v.setVisibility(0);
        }
        View.OnClickListener onClickListener = m8567N() ? new View.OnClickListener() { // from class: x1.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7390h.m32722e0(abstractC5314p0, this, i7, view);
            }
        } : null;
        abstractC5314p0.f20319w.setOnClickListener(onClickListener);
        abstractC5314p0.f20321y.setOnClickListener(onClickListener);
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: x1.g
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return C7390h.m32723f0(this.f29618a, i8, i7, view);
            }
        };
        abstractC5314p0.f20319w.setOnLongClickListener(onLongClickListener);
        abstractC5314p0.f20321y.setOnLongClickListener(onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final void m32721d0(C7390h c7390h, int i7, CompoundButton compoundButton, boolean z7) {
        AbstractC6118n.m27187e(compoundButton, "<unused var>");
        if (z7) {
            c7390h.m8566M().add(Integer.valueOf(i7));
        } else {
            c7390h.m8566M().remove(Integer.valueOf(i7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final void m32722e0(AbstractC5314p0 abstractC5314p0, C7390h c7390h, int i7, View view) {
        abstractC5314p0.f20320x.toggle();
        c7390h.m13323m(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final boolean m32723f0(C7390h c7390h, int i7, int i8, View view) {
        if (!c7390h.m8567N()) {
            Object objM8542F = c7390h.m8542F();
            AbstractC6118n.m27185c(objM8542F, "null cannot be cast to non-null type com.anas_mugally.clipboard.adapters.MutableSelectAdapter.OnMenuChangeListener");
            ((AbstractC2072h.a) objM8542F).mo8569C(c7390h);
            c7390h.m8568O(true);
        }
        c7390h.m8566M().add(Integer.valueOf(i7));
        c7390h.m13323m(i8);
        return true;
    }

    @Override // p189Z0.AbstractC2066b, androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: q */
    public void mo3682q(RecyclerView.AbstractC2749E holder, int i7) {
        final String str;
        AbstractC6118n.m27187e(holder, "holder");
        int iM8543G = m8543G(i7);
        if (holder instanceof a) {
            final AbstractC5314p0 abstractC5314p0M32724Q = ((a) holder).m32724Q();
            AbstractC6118n.m27184b(abstractC5314p0M32724Q);
            List listM8541E = m8541E();
            if (listM8541E == null || (str = (String) listM8541E.get(iM8543G)) == null) {
                str = "";
            }
            abstractC5314p0M32724Q.f20321y.setText(str);
            if (m32715X()) {
                abstractC5314p0M32724Q.f20318v.removeItem(R.id.send_text);
            }
            abstractC5314p0M32724Q.f20318v.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: x1.c
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return C7390h.m32718a0(this.f29608a, abstractC5314p0M32724Q, str, menuItem);
                }
            });
            abstractC5314p0M32724Q.f20318v.setOnMoreAppsItemClickListener(new InterfaceC5371p() { // from class: x1.d
                @Override // p238e6.InterfaceC5371p
                public final Object invoke(Object obj, Object obj2) {
                    return C7390h.m32719b0(this.f29611a, str, (ComponentName) obj, (ActionsLayout.EnumC3037c) obj2);
                }
            });
            m32720c0(abstractC5314p0M32724Q, i7, iM8543G);
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
        View viewInflate = LayoutInflater.from(m8542F()).inflate(R.layout.view_symbol_node, parent, false);
        AbstractC6118n.m27186d(viewInflate, "inflate(...)");
        return new a(this, viewInflate);
    }
}
