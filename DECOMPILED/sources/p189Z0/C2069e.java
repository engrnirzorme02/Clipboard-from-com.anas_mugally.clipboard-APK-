package p189Z0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.AbstractC2473f;
import androidx.recyclerview.widget.RecyclerView;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a;
import com.anas_mugally.clipboard.p221ui.notes.AbstractViewOnClickListenerC3141a;
import java.util.List;
import kotlin.jvm.internal.AbstractC6104G;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p111O.AbstractC0981A;
import p225d1.C5209a;
import p233e1.AbstractC5310n0;
import p238e6.InterfaceC5371p;
import p249g1.InterfaceC5454a;
import p249g1.InterfaceC5456c;

/* JADX INFO: renamed from: Z0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2069e extends AbstractC2066b {

    /* JADX INFO: renamed from: p */
    public static final a f6826p = new a(null);

    /* JADX INFO: renamed from: q */
    private static final int f6827q = 25;

    /* JADX INFO: renamed from: n */
    private InterfaceC5456c f6828n;

    /* JADX INFO: renamed from: o */
    private final int f6829o;

    /* JADX INFO: renamed from: Z0.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: Z0.e$b */
    public abstract class b extends RecyclerView.AbstractC2749E {

        /* JADX INFO: renamed from: u */
        private AbstractC5310n0 f6830u;

        /* JADX INFO: renamed from: v */
        final /* synthetic */ C2069e f6831v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2069e c2069e, View view) {
            super(view);
            AbstractC6118n.m27187e(view, "view");
            this.f6831v = c2069e;
            this.f6830u = (AbstractC5310n0) AbstractC2473f.m10822a(view);
        }

        /* JADX INFO: renamed from: Q */
        public final AbstractC5310n0 m8555Q() {
            return this.f6830u;
        }
    }

    /* JADX INFO: renamed from: Z0.e$c */
    public final class c extends b implements InterfaceC5454a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C2069e f6832w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C2069e c2069e, View view) {
            super(c2069e, view);
            AbstractC6118n.m27187e(view, "view");
            this.f6832w = c2069e;
        }

        @Override // p249g1.InterfaceC5454a
        /* JADX INFO: renamed from: a */
        public void mo8556a() {
            this.f10894a.setBackgroundColor(0);
        }

        @Override // p249g1.InterfaceC5454a
        /* JADX INFO: renamed from: b */
        public void mo8557b() {
            this.f10894a.setBackgroundColor(-3355444);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2069e(Context context, boolean z7, InterfaceC5456c mDragStartListener) {
        super(context, 100, R.layout.admob_naitve_large, false, Integer.valueOf(R.layout.myapp_naitve_big), z7);
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(mDragStartListener, "mDragStartListener");
        this.f6828n = mDragStartListener;
        this.f6829o = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final boolean m8553O(C2069e c2069e, int i7, MenuItem menuItem) {
        AbstractC6118n.m27187e(menuItem, "menuItem");
        Context contextM8542F = c2069e.m8542F();
        AbstractC6118n.m27185c(contextM8542F, "null cannot be cast to non-null type kotlin.Function2<kotlin.Int, kotlin.Int, kotlin.Unit>");
        ((InterfaceC5371p) AbstractC6104G.m27161d(contextM8542F, 2)).invoke(Integer.valueOf(i7), Integer.valueOf(menuItem.getItemId()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final boolean m8554P(boolean z7, ImageView imageView, C2069e c2069e, RecyclerView.AbstractC2749E abstractC2749E, View view, MotionEvent motionEvent) {
        if (z7) {
            Context context = imageView.getContext();
            AbstractC6118n.m27185c(context, "null cannot be cast to non-null type com.anas_mugally.clipboard.ui.BaseBillingActivity");
            View view2 = new View(imageView.getContext());
            view2.setId(R.id.in_app_purchasing);
            ((AbstractViewOnClickListenerC3111a) context).onClick(view2);
            return false;
        }
        if (AbstractC0981A.m4262a(motionEvent) != 0) {
            return false;
        }
        InterfaceC5456c interfaceC5456c = c2069e.f6828n;
        AbstractC6118n.m27184b(interfaceC5456c);
        interfaceC5456c.mo15564c(abstractC2749E);
        return false;
    }

    @Override // p189Z0.AbstractC2066b, androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: i */
    public int mo8549i(int i7) {
        return (!m8545I() || m8543G(i7) < AbstractViewOnClickListenerC3141a.f13140d1.m16594a()) ? super.mo8549i(i7) : this.f6829o;
    }

    @Override // p189Z0.AbstractC2066b, androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: q */
    public void mo3682q(final RecyclerView.AbstractC2749E holder, int i7) {
        AbstractC6118n.m27187e(holder, "holder");
        final int iM8543G = m8543G(i7);
        final boolean z7 = false;
        if (holder instanceof b) {
            AbstractC5310n0 abstractC5310n0M8555Q = ((b) holder).m8555Q();
            AbstractC6118n.m27184b(abstractC5310n0M8555Q);
            List listM8541E = m8541E();
            AbstractC6118n.m27184b(listM8541E);
            abstractC5310n0M8555Q.f20305w.setText(((C5209a) listM8541E.get(iM8543G)).m24099e());
            abstractC5310n0M8555Q.f20306x.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: Z0.c
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return C2069e.m8553O(this.f6820a, iM8543G, menuItem);
                }
            });
            final ImageView imageView = abstractC5310n0M8555Q.f20304v;
            imageView.setImageResource(R.drawable.ic_reorder);
            imageView.setOnTouchListener(new View.OnTouchListener() { // from class: Z0.d
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return C2069e.m8554P(z7, imageView, this, holder, view, motionEvent);
                }
            });
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
        if (i7 != this.f6829o && i7 == m8544H()) {
            View viewInflate = LayoutInflater.from(m8542F()).inflate(R.layout.view_symbol_category, (ViewGroup) null);
            AbstractC6118n.m27186d(viewInflate, "inflate(...)");
            return new c(this, viewInflate);
        }
        return super.mo3683s(parent, i7);
    }
}
