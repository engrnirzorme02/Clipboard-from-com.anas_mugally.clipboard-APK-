package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.H */
/* JADX INFO: loaded from: classes.dex */
public class C5070H extends AbstractC5092c implements InterfaceC5071I, RandomAccess {

    /* JADX INFO: renamed from: c */
    private static final C5070H f19328c;

    /* JADX INFO: renamed from: d */
    public static final InterfaceC5071I f19329d;

    /* JADX INFO: renamed from: b */
    private final List f19330b;

    static {
        C5070H c5070h = new C5070H(false);
        f19328c = c5070h;
        f19329d = c5070h;
    }

    private C5070H(boolean z7) {
        super(z7);
        this.f19330b = Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: e */
    private static String m22910e(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof AbstractC5104i ? ((AbstractC5104i) obj).m23169X() : AbstractC5063B.m22845i((byte[]) obj);
    }

    @Override // com.google.protobuf.InterfaceC5071I
    /* JADX INFO: renamed from: J */
    public InterfaceC5071I mo22911J() {
        return mo22849h() ? new C5135x0(this) : this;
    }

    @Override // com.google.protobuf.InterfaceC5071I
    /* JADX INFO: renamed from: M */
    public Object mo22912M(int i7) {
        return this.f19330b.get(i7);
    }

    @Override // com.google.protobuf.AbstractC5092c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i7, String str) {
        m23082a();
        this.f19330b.add(i7, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC5092c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m23082a();
        this.f19330b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC5092c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public String get(int i7) {
        Object obj = this.f19330b.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC5104i) {
            AbstractC5104i abstractC5104i = (AbstractC5104i) obj;
            String strM23169X = abstractC5104i.m23169X();
            if (abstractC5104i.mo23084B()) {
                this.f19330b.set(i7, strM23169X);
            }
            return strM23169X;
        }
        byte[] bArr = (byte[]) obj;
        String strM22845i = AbstractC5063B.m22845i(bArr);
        if (AbstractC5063B.m22843g(bArr)) {
            this.f19330b.set(i7, strM22845i);
        }
        return strM22845i;
    }

    @Override // com.google.protobuf.AbstractC5092c, com.google.protobuf.AbstractC5063B.e
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ boolean mo22849h() {
        return super.mo22849h();
    }

    @Override // com.google.protobuf.AbstractC5092c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.AbstractC5063B.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C5070H mo22823d(int i7) {
        if (i7 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i7);
        arrayList.addAll(this.f19330b);
        return new C5070H(arrayList);
    }

    @Override // com.google.protobuf.AbstractC5092c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public String remove(int i7) {
        m23082a();
        Object objRemove = this.f19330b.remove(i7);
        ((AbstractList) this).modCount++;
        return m22910e(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public String set(int i7, String str) {
        m23082a();
        return m22910e(this.f19330b.set(i7, str));
    }

    @Override // com.google.protobuf.InterfaceC5071I
    /* JADX INFO: renamed from: o */
    public void mo22918o(AbstractC5104i abstractC5104i) {
        m23082a();
        this.f19330b.add(abstractC5104i);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC5092c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.AbstractC5092c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19330b.size();
    }

    @Override // com.google.protobuf.InterfaceC5071I
    /* JADX INFO: renamed from: t */
    public List mo22919t() {
        return Collections.unmodifiableList(this.f19330b);
    }

    @Override // com.google.protobuf.AbstractC5092c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.protobuf.AbstractC5092c, java.util.AbstractList, java.util.List
    public boolean addAll(int i7, Collection collection) {
        m23082a();
        if (collection instanceof InterfaceC5071I) {
            collection = ((InterfaceC5071I) collection).mo22919t();
        }
        boolean zAddAll = this.f19330b.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.AbstractC5092c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C5070H(int i7) {
        this(new ArrayList(i7));
    }

    private C5070H(ArrayList arrayList) {
        this.f19330b = arrayList;
    }
}
