package p360t6;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: t6.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7126j {
    /* JADX INFO: renamed from: a */
    public static Object m31459a(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m31460b(Object obj, int i7, AbstractC6112h abstractC6112h) {
        if ((i7 & 1) != 0) {
            obj = null;
        }
        return m31459a(obj);
    }

    /* JADX INFO: renamed from: c */
    public static final Object m31461c(Object obj, Object obj2) {
        if (obj == null) {
            return m31459a(obj2);
        }
        if (obj instanceof ArrayList) {
            AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ((ArrayList) obj).add(obj2);
            return m31459a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return m31459a(arrayList);
    }
}
