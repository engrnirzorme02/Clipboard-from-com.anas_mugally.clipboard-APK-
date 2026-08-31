package p189Z0;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.anas_mugally.clipboard.R;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: Z0.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2071g extends AbstractC2072h {

    /* JADX INFO: renamed from: p */
    private final int f6834p;

    /* JADX INFO: renamed from: q */
    private b f6835q;

    /* JADX INFO: renamed from: r */
    private boolean f6836r;

    /* JADX INFO: renamed from: Z0.g$a */
    public static final class a extends RecyclerView.AbstractC2749E {

        /* JADX INFO: renamed from: v */
        public static final C7660a f6837v = new C7660a(null);

        /* JADX INFO: renamed from: u */
        private final TextView f6838u;

        /* JADX INFO: renamed from: Z0.g$a$a, reason: collision with other inner class name */
        public static final class C7660a {
            public /* synthetic */ C7660a(AbstractC6112h abstractC6112h) {
                this();
            }

            /* JADX INFO: renamed from: b */
            private final int m8563b(int i7) {
                return (int) TypedValue.applyDimension(1, i7, Resources.getSystem().getDisplayMetrics());
            }

            /* JADX INFO: renamed from: a */
            public final a m8564a(ViewGroup parent) {
                AbstractC6118n.m27187e(parent, "parent");
                TextView textView = new TextView(parent.getContext());
                textView.setLayoutParams(new RecyclerView.C2766q(-1, -2));
                textView.setGravity(17);
                textView.setTextAlignment(4);
                textView.setTypeface(textView.getTypeface(), 0);
                textView.setTextSize(2, 15.0f);
                textView.setText(R.string.show_more);
                C7660a c7660a = a.f6837v;
                textView.setMinHeight(c7660a.m8563b(48));
                int iM8563b = c7660a.m8563b(16);
                int iM8563b2 = c7660a.m8563b(10);
                textView.setPadding(iM8563b, iM8563b2, iM8563b, iM8563b2);
                textView.setClickable(true);
                textView.setFocusable(true);
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                }
                RecyclerView.C2766q c2766q = (RecyclerView.C2766q) layoutParams;
                ((ViewGroup.MarginLayoutParams) c2766q).width = -1;
                textView.setLayoutParams(c2766q);
                return new a(textView);
            }

            private C7660a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextView textView) {
            super(textView);
            AbstractC6118n.m27187e(textView, "textView");
            this.f6838u = textView;
        }

        /* JADX INFO: renamed from: Q */
        public final TextView m8562Q() {
            return this.f6838u;
        }
    }

    /* JADX INFO: renamed from: Z0.g$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo8565a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2071g(Context context, boolean z7) {
        super(context, z7);
        AbstractC6118n.m27187e(context, "context");
        this.f6834p = 3;
        this.f6836r = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final void m8559Q(AbstractC2071g abstractC2071g, View view) {
        b bVar = abstractC2071g.f6835q;
        if (bVar != null) {
            bVar.mo8565a();
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m8560R(boolean z7) {
        this.f6836r = z7;
    }

    /* JADX INFO: renamed from: S */
    public final void m8561S(b bVar) {
        this.f6835q = bVar;
    }

    @Override // p189Z0.AbstractC2066b, androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: g */
    public final int mo8548g() {
        int iMo8548g = super.mo8548g();
        return (!this.f6836r || m8545I()) ? iMo8548g : iMo8548g + 1;
    }

    @Override // p189Z0.AbstractC2066b, androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: i */
    public int mo8549i(int i7) {
        return (this.f6836r && mo8548g() == i7 + 1) ? this.f6834p : super.mo8549i(i7);
    }

    @Override // p189Z0.AbstractC2066b, androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: q */
    public void mo3682q(RecyclerView.AbstractC2749E h7, int i7) {
        AbstractC6118n.m27187e(h7, "h");
        if (h7 instanceof a) {
            ((a) h7).m8562Q().setOnClickListener(new View.OnClickListener() { // from class: Z0.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC2071g.m8559Q(this.f6833a, view);
                }
            });
        } else {
            super.mo3682q(h7, i7);
        }
    }

    @Override // p189Z0.AbstractC2066b, androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: s */
    public RecyclerView.AbstractC2749E mo3683s(ViewGroup parent, int i7) {
        AbstractC6118n.m27187e(parent, "parent");
        return i7 == this.f6834p ? a.f6837v.m8564a(parent) : super.mo3683s(parent, i7);
    }
}
