package p153U;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: U.b */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1649b {

    /* JADX INFO: renamed from: U.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo6821a(Object obj, Rect rect);
    }

    /* JADX INFO: renamed from: U.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        Object mo6823a(Object obj, int i7);

        /* JADX INFO: renamed from: b */
        int mo6824b(Object obj);
    }

    /* JADX INFO: renamed from: U.b$c */
    private static class c implements Comparator {

        /* JADX INFO: renamed from: a */
        private final Rect f5417a = new Rect();

        /* JADX INFO: renamed from: b */
        private final Rect f5418b = new Rect();

        /* JADX INFO: renamed from: c */
        private final boolean f5419c;

        /* JADX INFO: renamed from: d */
        private final a f5420d;

        c(boolean z7, a aVar) {
            this.f5419c = z7;
            this.f5420d = aVar;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            Rect rect = this.f5417a;
            Rect rect2 = this.f5418b;
            this.f5420d.mo6821a(obj, rect);
            this.f5420d.mo6821a(obj2, rect2);
            int i7 = rect.top;
            int i8 = rect2.top;
            if (i7 < i8) {
                return -1;
            }
            if (i7 > i8) {
                return 1;
            }
            int i9 = rect.left;
            int i10 = rect2.left;
            if (i9 < i10) {
                return this.f5419c ? 1 : -1;
            }
            if (i9 > i10) {
                return this.f5419c ? -1 : 1;
            }
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if (i11 < i12) {
                return -1;
            }
            if (i11 > i12) {
                return 1;
            }
            int i13 = rect.right;
            int i14 = rect2.right;
            if (i13 < i14) {
                return this.f5419c ? 1 : -1;
            }
            if (i13 > i14) {
                return this.f5419c ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m6827a(int i7, Rect rect, Rect rect2, Rect rect3) {
        boolean zM6828b = m6828b(i7, rect, rect2);
        if (m6828b(i7, rect, rect3) || !zM6828b) {
            return false;
        }
        return !m6836j(i7, rect, rect3) || i7 == 17 || i7 == 66 || m6837k(i7, rect, rect2) < m6839m(i7, rect, rect3);
    }

    /* JADX INFO: renamed from: b */
    private static boolean m6828b(int i7, Rect rect, Rect rect2) {
        if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX INFO: renamed from: c */
    public static Object m6829c(Object obj, b bVar, a aVar, Object obj2, Rect rect, int i7) {
        Rect rect2 = new Rect(rect);
        if (i7 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i7 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i7 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i7 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        int iMo6824b = bVar.mo6824b(obj);
        Rect rect3 = new Rect();
        Object obj3 = null;
        for (int i8 = 0; i8 < iMo6824b; i8++) {
            Object objMo6823a = bVar.mo6823a(obj, i8);
            if (objMo6823a != obj2) {
                aVar.mo6821a(objMo6823a, rect3);
                if (m6834h(i7, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    obj3 = objMo6823a;
                }
            }
        }
        return obj3;
    }

    /* JADX INFO: renamed from: d */
    public static Object m6830d(Object obj, b bVar, a aVar, Object obj2, int i7, boolean z7, boolean z8) {
        int iMo6824b = bVar.mo6824b(obj);
        ArrayList arrayList = new ArrayList(iMo6824b);
        for (int i8 = 0; i8 < iMo6824b; i8++) {
            arrayList.add(bVar.mo6823a(obj, i8));
        }
        Collections.sort(arrayList, new c(z7, aVar));
        if (i7 == 1) {
            return m6832f(obj2, arrayList, z8);
        }
        if (i7 == 2) {
            return m6831e(obj2, arrayList, z8);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* JADX INFO: renamed from: e */
    private static Object m6831e(Object obj, ArrayList arrayList, boolean z7) {
        int size = arrayList.size();
        int iLastIndexOf = (obj == null ? -1 : arrayList.lastIndexOf(obj)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z7 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* JADX INFO: renamed from: f */
    private static Object m6832f(Object obj, ArrayList arrayList, boolean z7) {
        int size = arrayList.size();
        int iIndexOf = (obj == null ? size : arrayList.indexOf(obj)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z7 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* JADX INFO: renamed from: g */
    private static int m6833g(int i7, int i8) {
        return (i7 * 13 * i7) + (i8 * i8);
    }

    /* JADX INFO: renamed from: h */
    private static boolean m6834h(int i7, Rect rect, Rect rect2, Rect rect3) {
        if (!m6835i(rect, rect2, i7)) {
            return false;
        }
        if (m6835i(rect, rect3, i7) && !m6827a(i7, rect, rect2, rect3)) {
            return !m6827a(i7, rect, rect3, rect2) && m6833g(m6837k(i7, rect, rect2), m6841o(i7, rect, rect2)) < m6833g(m6837k(i7, rect, rect3), m6841o(i7, rect, rect3));
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    private static boolean m6835i(Rect rect, Rect rect2, int i7) {
        if (i7 == 17) {
            int i8 = rect.right;
            int i9 = rect2.right;
            return (i8 > i9 || rect.left >= i9) && rect.left > rect2.left;
        }
        if (i7 == 33) {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            return (i10 > i11 || rect.top >= i11) && rect.top > rect2.top;
        }
        if (i7 == 66) {
            int i12 = rect.left;
            int i13 = rect2.left;
            return (i12 < i13 || rect.right <= i13) && rect.right < rect2.right;
        }
        if (i7 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i14 = rect.top;
        int i15 = rect2.top;
        return (i14 < i15 || rect.bottom <= i15) && rect.bottom < rect2.bottom;
    }

    /* JADX INFO: renamed from: j */
    private static boolean m6836j(int i7, Rect rect, Rect rect2) {
        if (i7 == 17) {
            return rect.left >= rect2.right;
        }
        if (i7 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i7 == 66) {
            return rect.right <= rect2.left;
        }
        if (i7 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* JADX INFO: renamed from: k */
    private static int m6837k(int i7, Rect rect, Rect rect2) {
        return Math.max(0, m6838l(i7, rect, rect2));
    }

    /* JADX INFO: renamed from: l */
    private static int m6838l(int i7, Rect rect, Rect rect2) {
        int i8;
        int i9;
        if (i7 == 17) {
            i8 = rect.left;
            i9 = rect2.right;
        } else if (i7 == 33) {
            i8 = rect.top;
            i9 = rect2.bottom;
        } else if (i7 == 66) {
            i8 = rect2.left;
            i9 = rect.right;
        } else {
            if (i7 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i8 = rect2.top;
            i9 = rect.bottom;
        }
        return i8 - i9;
    }

    /* JADX INFO: renamed from: m */
    private static int m6839m(int i7, Rect rect, Rect rect2) {
        return Math.max(1, m6840n(i7, rect, rect2));
    }

    /* JADX INFO: renamed from: n */
    private static int m6840n(int i7, Rect rect, Rect rect2) {
        int i8;
        int i9;
        if (i7 == 17) {
            i8 = rect.left;
            i9 = rect2.left;
        } else if (i7 == 33) {
            i8 = rect.top;
            i9 = rect2.top;
        } else if (i7 == 66) {
            i8 = rect2.right;
            i9 = rect.right;
        } else {
            if (i7 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i8 = rect2.bottom;
            i9 = rect.bottom;
        }
        return i8 - i9;
    }

    /* JADX INFO: renamed from: o */
    private static int m6841o(int i7, Rect rect, Rect rect2) {
        if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
