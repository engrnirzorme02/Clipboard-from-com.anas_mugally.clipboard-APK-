package p151T4;

import java.util.Map;
import p158U4.AbstractC1685i;
import p158U4.C1687k;
import p350s4.AbstractC7009c;

/* JADX INFO: renamed from: T4.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1564n {

    /* JADX INFO: renamed from: a */
    private final int f5277a;

    /* JADX INFO: renamed from: b */
    private final AbstractC7009c f5278b;

    C1564n(int i7, AbstractC7009c abstractC7009c) {
        this.f5277a = i7;
        this.f5278b = abstractC7009c;
    }

    /* JADX INFO: renamed from: a */
    public static C1564n m6425a(int i7, Map map) {
        AbstractC7009c abstractC7009cM7082a = AbstractC1685i.m7082a();
        for (Map.Entry entry : map.entrySet()) {
            abstractC7009cM7082a = abstractC7009cM7082a.mo30605n((C1687k) entry.getKey(), ((C1519X) entry.getValue()).m6368a());
        }
        return new C1564n(i7, abstractC7009cM7082a);
    }

    /* JADX INFO: renamed from: b */
    public int m6426b() {
        return this.f5277a;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC7009c m6427c() {
        return this.f5278b;
    }
}
