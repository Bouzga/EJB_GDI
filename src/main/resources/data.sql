INSERT INTO `sr`.etudiant (id_etudiant, nom, prenom, num_appogee, password, email, date_naiss) VALUES (NULL, 'oumnia', 'bouzga', 's123', 'oumnia2001', 'oum@gmail.com', '2001-05-06');
INSERT INTO `sr`.enseignant(id_ens, email, nom, num_tel, prenom) VALUES (NULL,'oum@gmail.com','oumnia',05639687,'Bouzga');
INSERT INTO `sr`.cours(id_cours, nom_cours, enseignant_id) VALUES (NULL, 'SR', '1');
INSERT INTO `sr`.cordinateur(id_cord, email, nom, num_tel, prenom) VALUES (NULL, 'a@gmail.com', 'a',02136548,'oum');
INSERT INTO `sr`.note(note, cours_id_cours, enseignant_id_ens, etudiant_id_etudiant, id_note) VALUES (15, 1, 1,1,1);
INSERT INTO `sr`.relve_note(idrn, nom_matiere, semestre) VALUES (NULL,'sr','S2');