package p032D6;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6118n;
import p016B6.InterfaceC0096d;
import p408z6.InterfaceC7616b;

/* JADX INFO: renamed from: D6.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0228i extends AbstractC0231l {

    /* JADX INFO: renamed from: c */
    private final InterfaceC0096d f946c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0228i(InterfaceC7616b kSerializer, InterfaceC7616b vSerializer) {
        super(kSerializer, vSerializer, null);
        AbstractC6118n.m27187e(kSerializer, "kSerializer");
        AbstractC6118n.m27187e(vSerializer, "vSerializer");
        this.f946c = new C0227h(kSerializer.mo1120a(), vSerializer.mo1120a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p032D6.AbstractC0220a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap mo1118p(Map map) {
        AbstractC6118n.m27187e(map, "<this>");
        LinkedHashMap linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap(map) : linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p032D6.AbstractC0220a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Map mo1119q(LinkedHashMap linkedHashMap) {
        AbstractC6118n.m27187e(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override // p032D6.AbstractC0231l, p408z6.InterfaceC7616b, p408z6.InterfaceC7619e, p408z6.InterfaceC7615a
    /* JADX INFO: renamed from: a */
    public InterfaceC0096d mo1120a() {
        return this.f946c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p032D6.AbstractC0220a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap mo1110f() {
        return new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p032D6.AbstractC0220a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int mo1111g(LinkedHashMap linkedHashMap) {
        AbstractC6118n.m27187e(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p032D6.AbstractC0220a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo1112h(LinkedHashMap linkedHashMap, int i7) {
        AbstractC6118n.m27187e(linkedHashMap, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p032D6.AbstractC0220a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Iterator mo1113i(Map map) {
        AbstractC6118n.m27187e(map, "<this>");
        return map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p032D6.AbstractC0220a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public int mo1114j(Map map) {
        AbstractC6118n.m27187e(map, "<this>");
        return map.size();
    }
}
