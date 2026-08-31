package com.google.firebase.firestore;

import android.util.SparseArray;
import p164V3.C1768m;
import p186Y4.AbstractC2034b;
import p186Y4.AbstractC2051s;

/* JADX INFO: renamed from: com.google.firebase.firestore.n */
/* JADX INFO: loaded from: classes.dex */
public class C4928n extends C1768m {

    /* JADX INFO: renamed from: a */
    private final a f18685a;

    /* JADX INFO: renamed from: com.google.firebase.firestore.n$a */
    public enum a {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);


        /* JADX INFO: renamed from: D */
        private static final SparseArray f18689D = m22173d();

        /* JADX INFO: renamed from: a */
        private final int f18705a;

        a(int i7) {
            this.f18705a = i7;
        }

        /* JADX INFO: renamed from: d */
        private static SparseArray m22173d() {
            SparseArray sparseArray = new SparseArray();
            for (a aVar : values()) {
                a aVar2 = (a) sparseArray.get(aVar.m22175j());
                if (aVar2 != null) {
                    throw new IllegalStateException("Code value duplication between " + aVar2 + "&" + aVar.name());
                }
                sparseArray.put(aVar.m22175j(), aVar);
            }
            return sparseArray;
        }

        /* JADX INFO: renamed from: h */
        public static a m22174h(int i7) {
            return (a) f18689D.get(i7, UNKNOWN);
        }

        /* JADX INFO: renamed from: j */
        public int m22175j() {
            return this.f18705a;
        }
    }

    public C4928n(String str, a aVar) {
        super(str);
        AbstractC2051s.m8521b(str, "Provided message must not be null.");
        AbstractC2034b.m8460d(aVar != a.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        this.f18685a = (a) AbstractC2051s.m8521b(aVar, "Provided code must not be null.");
    }

    public C4928n(String str, a aVar, Throwable th) {
        super(str, th);
        AbstractC2051s.m8521b(str, "Provided message must not be null.");
        AbstractC2034b.m8460d(aVar != a.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        this.f18685a = (a) AbstractC2051s.m8521b(aVar, "Provided code must not be null.");
    }
}
