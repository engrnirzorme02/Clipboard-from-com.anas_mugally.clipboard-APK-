package p387x1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractActivityC2592j;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1638q;

/* JADX INFO: renamed from: x1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C7391i extends AbstractComponentCallbacksC2591i {

    /* JADX INFO: renamed from: r0 */
    public static final a f29625r0 = new a(null);

    /* JADX INFO: renamed from: o0 */
    private RecyclerView f29626o0;

    /* JADX INFO: renamed from: p0 */
    private C7390h f29627p0;

    /* JADX INFO: renamed from: q0 */
    private ArrayList f29628q0 = new ArrayList();

    /* JADX INFO: renamed from: x1.i$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C7391i m32726a(ArrayList nodes) {
            AbstractC6118n.m27187e(nodes, "nodes");
            C7391i c7391i = new C7391i();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("nodes_list", nodes);
            c7391i.m12117E1(bundle);
            return c7391i;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: Q1 */
    private final void m32725Q1() {
        RecyclerView recyclerView = this.f29626o0;
        C7390h c7390h = null;
        if (recyclerView == null) {
            AbstractC6118n.m27197o("recyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(m12204u()));
        Context contextM12214y1 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y1, "requireContext(...)");
        AbstractActivityC2592j abstractActivityC2592jM12184m = m12184m();
        AbstractC6118n.m27185c(abstractActivityC2592jM12184m, "null cannot be cast to non-null type com.anas_mugally.clipboard.ui.BaseBillingActivity");
        C7390h c7390h2 = new C7390h(contextM12214y1, ((AbstractViewOnClickListenerC3111a) abstractActivityC2592jM12184m).m15845V1());
        this.f29627p0 = c7390h2;
        ArrayList arrayList = this.f29628q0;
        ArrayList arrayList2 = new ArrayList(AbstractC1638q.m6774s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) it.next());
        }
        c7390h2.m8546K(arrayList2);
        RecyclerView recyclerView2 = this.f29626o0;
        if (recyclerView2 == null) {
            AbstractC6118n.m27197o("recyclerView");
            recyclerView2 = null;
        }
        C7390h c7390h3 = this.f29627p0;
        if (c7390h3 == null) {
            AbstractC6118n.m27197o("adapter");
        } else {
            c7390h = c7390h3;
        }
        recyclerView2.setAdapter(c7390h);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: U0 */
    public void mo1869U0(View view, Bundle bundle) {
        AbstractC6118n.m27187e(view, "view");
        super.mo1869U0(view, bundle);
        this.f29626o0 = (RecyclerView) view.findViewById(R.id.recycler_view);
        m32725Q1();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: v0 */
    public void mo681v0(Bundle bundle) {
        super.mo681v0(bundle);
        Bundle bundleM12199s = m12199s();
        if (bundleM12199s != null) {
            ArrayList<String> stringArrayList = bundleM12199s.getStringArrayList("nodes_list");
            if (stringArrayList == null) {
                stringArrayList = new ArrayList<>();
            }
            this.f29628q0 = stringArrayList;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: z0 */
    public View mo682z0(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC6118n.m27187e(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_nodes, viewGroup, false);
    }
}
