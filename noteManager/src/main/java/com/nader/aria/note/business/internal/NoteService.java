package com.nader.aria.note.business.internal;

import com.nader.aria.base.business.internal.GeneralService;
import com.nader.aria.note.enitites.Note;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class NoteService implements GeneralService<Note> {
}
