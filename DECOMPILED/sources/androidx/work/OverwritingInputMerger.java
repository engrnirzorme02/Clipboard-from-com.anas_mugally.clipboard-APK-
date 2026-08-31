package androidx.work;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p112O0.AbstractC1095h;

/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends AbstractC1095h {
    @Override // p112O0.AbstractC1095h
    /* JADX INFO: renamed from: b */
    public C2896b mo4840b(List list) {
        C2896b.a aVar = new C2896b.a();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            map.putAll(((C2896b) it.next()).m14502h());
        }
        aVar.m14507c(map);
        return aVar.m14505a();
    }
}
