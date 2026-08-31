package p189Z0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a;
import com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import p111O.AbstractC1047f0;
import p294l6.AbstractC6307h;

/* JADX INFO: renamed from: Z0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2066b extends RecyclerView.AbstractC2757h {

    /* JADX INFO: renamed from: d */
    private Context f6808d;

    /* JADX INFO: renamed from: e */
    private final int f6809e;

    /* JADX INFO: renamed from: f */
    private final int f6810f;

    /* JADX INFO: renamed from: g */
    private boolean f6811g;

    /* JADX INFO: renamed from: h */
    private final Integer f6812h;

    /* JADX INFO: renamed from: i */
    private boolean f6813i;

    /* JADX INFO: renamed from: j */
    private final int f6814j;

    /* JADX INFO: renamed from: k */
    private final int f6815k;

    /* JADX INFO: renamed from: l */
    private final int f6816l;

    /* JADX INFO: renamed from: m */
    private List f6817m;

    /* JADX INFO: renamed from: Z0.b$a */
    public final class a extends RecyclerView.AbstractC2749E {

        /* JADX INFO: renamed from: u */
        private final ViewGroup f6818u;

        /* JADX INFO: renamed from: v */
        final /* synthetic */ AbstractC2066b f6819v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC2066b abstractC2066b, View view) {
            super(view);
            AbstractC6118n.m27187e(view, "view");
            this.f6819v = abstractC2066b;
            Object objJ = AbstractC6307h.m27245j(AbstractC1047f0.m4662a((ViewGroup) view));
            AbstractC6118n.m27185c(objJ, "null cannot be cast to non-null type android.view.ViewGroup");
            this.f6818u = (ViewGroup) objJ;
        }

        /* JADX INFO: renamed from: Q */
        public final ViewGroup m8550Q() {
            return this.f6818u;
        }
    }

    public AbstractC2066b(Context context, int i7, int i8, boolean z7, Integer num, boolean z8) {
        AbstractC6118n.m27187e(context, "context");
        this.f6808d = context;
        this.f6809e = i7;
        this.f6810f = i8;
        this.f6811g = z7;
        this.f6812h = num;
        this.f6813i = z8;
        this.f6814j = 2;
        this.f6815k = 1;
    }

    /* JADX INFO: renamed from: C */
    private final int m8538C(int i7) {
        return (i7 / this.f6809e) + 1;
    }

    /* JADX INFO: renamed from: D */
    private final int m8539D(int i7) {
        return m8538C(i7 + (i7 / this.f6809e) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final void m8540J(BaseMyAppAdsActivity baseMyAppAdsActivity, a aVar, AbstractC2066b abstractC2066b, boolean z7) {
        if (z7) {
            return;
        }
        ViewGroup viewGroupM8550Q = aVar.m8550Q();
        Integer num = abstractC2066b.f6812h;
        AbstractC6118n.m27184b(num);
        BaseMyAppAdsActivity.m16158V3(baseMyAppAdsActivity, viewGroupM8550Q, num.intValue(), null, 4, null);
    }

    /* JADX INFO: renamed from: E */
    public final List m8541E() {
        return this.f6817m;
    }

    /* JADX INFO: renamed from: F */
    protected final Context m8542F() {
        return this.f6808d;
    }

    /* JADX INFO: renamed from: G */
    public final int m8543G(int i7) {
        return i7 - (this.f6813i ? m8538C(i7) : 0);
    }

    /* JADX INFO: renamed from: H */
    protected final int m8544H() {
        return this.f6816l;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m8545I() {
        return this.f6813i;
    }

    /* JADX INFO: renamed from: K */
    public final void m8546K(List list) {
        this.f6817m = list;
        m13322l();
    }

    /* JADX INFO: renamed from: L */
    public final void m8547L(boolean z7) {
        this.f6813i = z7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: g */
    public int mo8548g() {
        List list = this.f6817m;
        int size = list != null ? list.size() : 0;
        if (this.f6813i) {
            size += m8539D(size);
        }
        return (this.f6811g && this.f6813i) ? size + 1 : size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: i */
    public int mo8549i(int i7) {
        if (this.f6811g && mo8548g() == i7 + 1 && this.f6813i) {
            return this.f6814j;
        }
        return (i7 % this.f6809e == 0 && this.f6813i) ? this.f6815k : this.f6816l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: q */
    public void mo3682q(RecyclerView.AbstractC2749E h7, int i7) {
        AbstractC6118n.m27187e(h7, "h");
        final a aVar = (a) h7;
        Context context = this.f6808d;
        AbstractC6118n.m27185c(context, "null cannot be cast to non-null type com.anas_mugally.clipboard.ui.ads.BaseMyAppAdsActivity");
        final BaseMyAppAdsActivity baseMyAppAdsActivity = (BaseMyAppAdsActivity) context;
        if (aVar.m13280p() == this.f6815k) {
            AbstractActivityC3130a.m16217T2(baseMyAppAdsActivity, aVar.m8550Q(), this.f6810f, null, new AbstractActivityC3130a.a() { // from class: Z0.a
                @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a.a
                /* JADX INFO: renamed from: a */
                public final void mo8536a(boolean z7) {
                    AbstractC2066b.m8540J(baseMyAppAdsActivity, aVar, this, z7);
                }
            }, 4, null);
            return;
        }
        ViewGroup viewGroupM8550Q = aVar.m8550Q();
        Integer num = this.f6812h;
        AbstractC6118n.m27184b(num);
        BaseMyAppAdsActivity.m16158V3(baseMyAppAdsActivity, viewGroupM8550Q, num.intValue(), null, 4, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: s */
    public RecyclerView.AbstractC2749E mo3683s(ViewGroup parent, int i7) {
        AbstractC6118n.m27187e(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_ad, parent, false);
        AbstractC6118n.m27186d(viewInflate, "inflate(...)");
        return new a(this, viewInflate);
    }
}
