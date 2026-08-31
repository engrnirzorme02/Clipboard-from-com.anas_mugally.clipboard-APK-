package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.x0 */
/* JADX INFO: loaded from: classes.dex */
public class C5135x0 extends AbstractList implements InterfaceC5071I, RandomAccess {

    /* JADX INFO: renamed from: a */
    private final InterfaceC5071I f19615a;

    /* JADX INFO: renamed from: com.google.protobuf.x0$a */
    class a implements ListIterator {

        /* JADX INFO: renamed from: a */
        ListIterator f19616a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f19617b;

        a(int i7) {
            this.f19617b = i7;
            this.f19616a = C5135x0.this.f19615a.listIterator(i7);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f19616a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f19616a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f19616a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f19616a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f19616a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f19616a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.x0$b */
    class b implements Iterator {

        /* JADX INFO: renamed from: a */
        Iterator f19619a;

        b() {
            this.f19619a = C5135x0.this.f19615a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f19619a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19619a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C5135x0(InterfaceC5071I interfaceC5071I) {
        this.f19615a = interfaceC5071I;
    }

    @Override // com.google.protobuf.InterfaceC5071I
    /* JADX INFO: renamed from: J */
    public InterfaceC5071I mo22911J() {
        return this;
    }

    @Override // com.google.protobuf.InterfaceC5071I
    /* JADX INFO: renamed from: M */
    public Object mo22912M(int i7) {
        return this.f19615a.mo22912M(i7);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get(int i7) {
        return (String) this.f19615a.get(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i7) {
        return new a(i7);
    }

    @Override // com.google.protobuf.InterfaceC5071I
    /* JADX INFO: renamed from: o */
    public void mo22918o(AbstractC5104i abstractC5104i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19615a.size();
    }

    @Override // com.google.protobuf.InterfaceC5071I
    /* JADX INFO: renamed from: t */
    public List mo22919t() {
        return this.f19615a.mo22919t();
    }
}
