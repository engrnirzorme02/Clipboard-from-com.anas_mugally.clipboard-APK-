package p249g1;

import androidx.recyclerview.widget.C2787f;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC6118n;
import p189Z0.AbstractC2066b;

/* JADX INFO: renamed from: g1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5458e extends C2787f.e {

    /* JADX INFO: renamed from: d */
    private final InterfaceC5457d f20760d;

    public C5458e(InterfaceC5457d onMoveOrDismissItemListener) {
        AbstractC6118n.m27187e(onMoveOrDismissItemListener, "onMoveOrDismissItemListener");
        this.f20760d = onMoveOrDismissItemListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.C2787f.e
    /* JADX INFO: renamed from: A */
    public void mo13787A(RecyclerView.AbstractC2749E abstractC2749E, int i7) {
        if (i7 != 0 && (abstractC2749E instanceof InterfaceC5454a)) {
            ((InterfaceC5454a) abstractC2749E).mo8557b();
        }
        super.mo13787A(abstractC2749E, i7);
    }

    @Override // androidx.recyclerview.widget.C2787f.e
    /* JADX INFO: renamed from: B */
    public void mo13788B(RecyclerView.AbstractC2749E viewHolder, int i7) {
        AbstractC6118n.m27187e(viewHolder, "viewHolder");
        this.f20760d.mo15560M(viewHolder.m13277m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.C2787f.e
    /* JADX INFO: renamed from: c */
    public void mo13791c(RecyclerView recyclerView, RecyclerView.AbstractC2749E viewHolder) {
        AbstractC6118n.m27187e(recyclerView, "recyclerView");
        AbstractC6118n.m27187e(viewHolder, "viewHolder");
        super.mo13791c(recyclerView, viewHolder);
        if (viewHolder instanceof InterfaceC5454a) {
            ((InterfaceC5454a) viewHolder).mo8556a();
        }
        Object context = recyclerView.getContext();
        if (context instanceof InterfaceC5455b) {
            ((InterfaceC5455b) context).mo15559L();
        }
    }

    @Override // androidx.recyclerview.widget.C2787f.e
    /* JADX INFO: renamed from: k */
    public int mo13797k(RecyclerView rv, RecyclerView.AbstractC2749E holder) {
        AbstractC6118n.m27187e(rv, "rv");
        AbstractC6118n.m27187e(holder, "holder");
        if (holder instanceof AbstractC2066b.a) {
            return 0;
        }
        return C2787f.e.m13786t(3, 48);
    }

    @Override // androidx.recyclerview.widget.C2787f.e
    /* JADX INFO: renamed from: q */
    public boolean mo13803q() {
        return true;
    }

    @Override // androidx.recyclerview.widget.C2787f.e
    /* JADX INFO: renamed from: r */
    public boolean mo13804r() {
        return false;
    }

    @Override // androidx.recyclerview.widget.C2787f.e
    /* JADX INFO: renamed from: y */
    public boolean mo13809y(RecyclerView recyclerView, RecyclerView.AbstractC2749E source, RecyclerView.AbstractC2749E target) {
        AbstractC6118n.m27187e(recyclerView, "recyclerView");
        AbstractC6118n.m27187e(source, "source");
        AbstractC6118n.m27187e(target, "target");
        if (source.m13280p() != target.m13280p()) {
            return false;
        }
        this.f20760d.mo15561N(source.m13277m(), target.m13277m());
        return true;
    }
}
