package p283k3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: k3.L */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC6029L {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Set m27048a(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
