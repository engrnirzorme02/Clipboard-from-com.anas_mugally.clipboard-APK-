package p010B0;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: B0.l */
/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class AbstractC0053l {
    /* JADX INFO: renamed from: a */
    public static final ArrayList m205a(Collection collection) {
        AbstractC6118n.m27187e(collection, "<this>");
        return collection instanceof ArrayList ? (ArrayList) collection : new ArrayList(collection);
    }
}
