package androidx.recyclerview.widget;

import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.k */
/* JADX INFO: loaded from: classes.dex */
class C2792k {

    /* JADX INFO: renamed from: a */
    final a f11232a;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.k$a */
    interface a {
        /* JADX INFO: renamed from: a */
        void mo13661a(C2782a.b bVar);

        /* JADX INFO: renamed from: b */
        C2782a.b mo13662b(int i7, int i8, int i9, Object obj);
    }

    C2792k(a aVar) {
        this.f11232a = aVar;
    }

    /* JADX INFO: renamed from: a */
    private int m13835a(List list) {
        boolean z7 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((C2782a.b) list.get(size)).f11045a != 8) {
                z7 = true;
            } else if (z7) {
                return size;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    private void m13836c(List list, int i7, C2782a.b bVar, int i8, C2782a.b bVar2) {
        int i9 = bVar.f11048d;
        int i10 = bVar2.f11046b;
        int i11 = i9 < i10 ? -1 : 0;
        int i12 = bVar.f11046b;
        if (i12 < i10) {
            i11++;
        }
        if (i10 <= i12) {
            bVar.f11046b = i12 + bVar2.f11048d;
        }
        int i13 = bVar2.f11046b;
        if (i13 <= i9) {
            bVar.f11048d = i9 + bVar2.f11048d;
        }
        bVar2.f11046b = i13 + i11;
        list.set(i7, bVar2);
        list.set(i8, bVar);
    }

    /* JADX INFO: renamed from: d */
    private void m13837d(List list, int i7, int i8) {
        C2782a.b bVar = (C2782a.b) list.get(i7);
        C2782a.b bVar2 = (C2782a.b) list.get(i8);
        int i9 = bVar2.f11045a;
        if (i9 == 1) {
            m13836c(list, i7, bVar, i8, bVar2);
        } else if (i9 == 2) {
            m13839e(list, i7, bVar, i8, bVar2);
        } else {
            if (i9 != 4) {
                return;
            }
            m13840f(list, i7, bVar, i8, bVar2);
        }
    }

    /* JADX INFO: renamed from: b */
    void m13838b(List list) {
        while (true) {
            int iM13835a = m13835a(list);
            if (iM13835a == -1) {
                return;
            } else {
                m13837d(list, iM13835a, iM13835a + 1);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    void m13839e(List list, int i7, C2782a.b bVar, int i8, C2782a.b bVar2) {
        boolean z7;
        int i9 = bVar.f11046b;
        int i10 = bVar.f11048d;
        boolean z8 = false;
        if (i9 < i10) {
            if (bVar2.f11046b == i9 && bVar2.f11048d == i10 - i9) {
                z7 = false;
                z8 = true;
            } else {
                z7 = false;
            }
        } else if (bVar2.f11046b == i10 + 1 && bVar2.f11048d == i9 - i10) {
            z7 = true;
            z8 = true;
        } else {
            z7 = true;
        }
        int i11 = bVar2.f11046b;
        if (i10 < i11) {
            bVar2.f11046b = i11 - 1;
        } else {
            int i12 = bVar2.f11048d;
            if (i10 < i11 + i12) {
                bVar2.f11048d = i12 - 1;
                bVar.f11045a = 2;
                bVar.f11048d = 1;
                if (bVar2.f11048d == 0) {
                    list.remove(i8);
                    this.f11232a.mo13661a(bVar2);
                    return;
                }
                return;
            }
        }
        int i13 = bVar.f11046b;
        int i14 = bVar2.f11046b;
        C2782a.b bVarMo13662b = null;
        if (i13 <= i14) {
            bVar2.f11046b = i14 + 1;
        } else {
            int i15 = bVar2.f11048d;
            if (i13 < i14 + i15) {
                bVarMo13662b = this.f11232a.mo13662b(2, i13 + 1, (i14 + i15) - i13, null);
                bVar2.f11048d = bVar.f11046b - bVar2.f11046b;
            }
        }
        if (z8) {
            list.set(i7, bVar2);
            list.remove(i8);
            this.f11232a.mo13661a(bVar);
            return;
        }
        if (z7) {
            if (bVarMo13662b != null) {
                int i16 = bVar.f11046b;
                if (i16 > bVarMo13662b.f11046b) {
                    bVar.f11046b = i16 - bVarMo13662b.f11048d;
                }
                int i17 = bVar.f11048d;
                if (i17 > bVarMo13662b.f11046b) {
                    bVar.f11048d = i17 - bVarMo13662b.f11048d;
                }
            }
            int i18 = bVar.f11046b;
            if (i18 > bVar2.f11046b) {
                bVar.f11046b = i18 - bVar2.f11048d;
            }
            int i19 = bVar.f11048d;
            if (i19 > bVar2.f11046b) {
                bVar.f11048d = i19 - bVar2.f11048d;
            }
        } else {
            if (bVarMo13662b != null) {
                int i20 = bVar.f11046b;
                if (i20 >= bVarMo13662b.f11046b) {
                    bVar.f11046b = i20 - bVarMo13662b.f11048d;
                }
                int i21 = bVar.f11048d;
                if (i21 >= bVarMo13662b.f11046b) {
                    bVar.f11048d = i21 - bVarMo13662b.f11048d;
                }
            }
            int i22 = bVar.f11046b;
            if (i22 >= bVar2.f11046b) {
                bVar.f11046b = i22 - bVar2.f11048d;
            }
            int i23 = bVar.f11048d;
            if (i23 >= bVar2.f11046b) {
                bVar.f11048d = i23 - bVar2.f11048d;
            }
        }
        list.set(i7, bVar2);
        if (bVar.f11046b != bVar.f11048d) {
            list.set(i8, bVar);
        } else {
            list.remove(i8);
        }
        if (bVarMo13662b != null) {
            list.add(i7, bVarMo13662b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    void m13840f(List list, int i7, C2782a.b bVar, int i8, C2782a.b bVar2) {
        C2782a.b bVarMo13662b;
        int i9;
        int i10;
        int i11;
        int i12 = bVar.f11048d;
        int i13 = bVar2.f11046b;
        C2782a.b bVarMo13662b2 = null;
        if (i12 >= i13) {
            int i14 = bVar2.f11048d;
            if (i12 < i13 + i14) {
                bVar2.f11048d = i14 - 1;
                bVarMo13662b = this.f11232a.mo13662b(4, bVar.f11046b, 1, bVar2.f11047c);
            }
            i9 = bVar.f11046b;
            i10 = bVar2.f11046b;
            if (i9 <= i10) {
                bVar2.f11046b = i10 + 1;
            } else {
                i11 = bVar2.f11048d;
                if (i9 < i10 + i11) {
                    int i15 = (i10 + i11) - i9;
                    bVarMo13662b2 = this.f11232a.mo13662b(4, i9 + 1, i15, bVar2.f11047c);
                    bVar2.f11048d -= i15;
                }
            }
            list.set(i8, bVar);
            if (bVar2.f11048d > 0) {
                list.set(i7, bVar2);
            } else {
                list.remove(i7);
                this.f11232a.mo13661a(bVar2);
            }
            if (bVarMo13662b != null) {
                list.add(i7, bVarMo13662b);
            }
            if (bVarMo13662b2 != null) {
                list.add(i7, bVarMo13662b2);
            }
        }
        bVar2.f11046b = i13 - 1;
        bVarMo13662b = null;
        i9 = bVar.f11046b;
        i10 = bVar2.f11046b;
        if (i9 <= i10) {
            bVar2.f11046b = i10 + 1;
        } else {
            i11 = bVar2.f11048d;
            if (i9 < i10 + i11) {
                int i16 = (i10 + i11) - i9;
                bVarMo13662b2 = this.f11232a.mo13662b(4, i9 + 1, i16, bVar2.f11047c);
                bVar2.f11048d -= i16;
            }
        }
        list.set(i8, bVar);
        if (bVar2.f11048d > 0) {
            list.set(i7, bVar2);
        } else {
            list.remove(i7);
            this.f11232a.mo13661a(bVar2);
        }
        if (bVarMo13662b != null) {
            list.add(i7, bVarMo13662b);
        }
        if (bVarMo13662b2 != null) {
            list.add(i7, bVarMo13662b2);
        }
    }
}
