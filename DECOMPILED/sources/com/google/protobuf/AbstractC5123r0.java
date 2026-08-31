package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.r0 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5123r0 {

    /* JADX INFO: renamed from: com.google.protobuf.r0$a */
    class a implements b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC5104i f19529a;

        a(AbstractC5104i abstractC5104i) {
            this.f19529a = abstractC5104i;
        }

        @Override // com.google.protobuf.AbstractC5123r0.b
        /* JADX INFO: renamed from: a */
        public byte mo23577a(int i7) {
            return this.f19529a.mo23093g(i7);
        }

        @Override // com.google.protobuf.AbstractC5123r0.b
        public int size() {
            return this.f19529a.size();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.r0$b */
    private interface b {
        /* JADX INFO: renamed from: a */
        byte mo23577a(int i7);

        int size();
    }

    /* JADX INFO: renamed from: a */
    static String m23574a(AbstractC5104i abstractC5104i) {
        return m23575b(new a(abstractC5104i));
    }

    /* JADX INFO: renamed from: b */
    static String m23575b(b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i7 = 0; i7 < bVar.size(); i7++) {
            byte bMo23577a = bVar.mo23577a(i7);
            if (bMo23577a == 34) {
                sb.append("\\\"");
            } else if (bMo23577a == 39) {
                sb.append("\\'");
            } else if (bMo23577a != 92) {
                switch (bMo23577a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo23577a < 32 || bMo23577a > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo23577a >>> 6) & 3) + 48));
                            sb.append((char) (((bMo23577a >>> 3) & 7) + 48));
                            sb.append((char) ((bMo23577a & 7) + 48));
                        } else {
                            sb.append((char) bMo23577a);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    static String m23576c(String str) {
        return m23574a(AbstractC5104i.m23162v(str));
    }
}
