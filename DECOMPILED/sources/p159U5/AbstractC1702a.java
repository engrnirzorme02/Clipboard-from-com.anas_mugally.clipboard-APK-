package p159U5;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1628g;

/* JADX INFO: renamed from: U5.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1702a extends AbstractC1628g {
    /* JADX INFO: renamed from: b */
    public final boolean m7199b(Map.Entry element) {
        AbstractC6118n.m27187e(element, "element");
        return mo7200e(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return m7199b((Map.Entry) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo7200e(Map.Entry entry);

    /* JADX INFO: renamed from: g */
    public abstract /* bridge */ boolean mo7201g(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return mo7201g((Map.Entry) obj);
        }
        return false;
    }
}
