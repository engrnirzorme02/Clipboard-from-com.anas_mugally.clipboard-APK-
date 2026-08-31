package p089L;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: L.h */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0772h {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ List m3623a(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
