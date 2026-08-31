package p387x1;

import androidx.fragment.app.AbstractActivityC2592j;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6118n;
import p090L0.AbstractC0778a;

/* JADX INFO: renamed from: x1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C7392j extends AbstractC0778a {

    /* JADX INFO: renamed from: l */
    private final List f29629l;

    /* JADX INFO: renamed from: m */
    private final Map f29630m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7392j(AbstractActivityC2592j activity) {
        super(activity);
        AbstractC6118n.m27187e(activity, "activity");
        this.f29629l = new ArrayList();
        this.f29630m = new LinkedHashMap();
    }

    @Override // p090L0.AbstractC0778a
    /* JADX INFO: renamed from: D */
    public AbstractComponentCallbacksC2591i mo3669D(int i7) {
        ArrayList arrayList = (ArrayList) this.f29630m.get((String) this.f29629l.get(i7));
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        return C7391i.f29625r0.m32726a(arrayList);
    }

    /* JADX INFO: renamed from: V */
    public final String m32727V(int i7) {
        return i7 < this.f29629l.size() ? (String) this.f29629l.get(i7) : "";
    }

    /* JADX INFO: renamed from: W */
    public final void m32728W(List tabs, Map data) {
        AbstractC6118n.m27187e(tabs, "tabs");
        AbstractC6118n.m27187e(data, "data");
        this.f29629l.clear();
        this.f29629l.addAll(tabs);
        this.f29630m.clear();
        this.f29630m.putAll(data);
        m13322l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: g */
    public int mo8548g() {
        return this.f29629l.size();
    }
}
